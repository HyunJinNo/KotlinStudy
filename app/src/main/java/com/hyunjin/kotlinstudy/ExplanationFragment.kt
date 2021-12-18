package com.hyunjin.kotlinstudy

import android.os.Bundle
import android.text.util.Linkify
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.hyunjin.kotlinstudy.databinding.FragmentExplanationBinding

class ExplanationFragment : Fragment() {
    private var _binding: FragmentExplanationBinding? = null
    private val binding get() = _binding!!
    private lateinit var explanations: Array<TextView>
    private lateinit var images: Array<ImageView>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExplanationBinding.inflate(layoutInflater, container, false)
        val layout = binding.linearLayout
        val layoutParams = LinearLayoutCompat.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(16, 8, 16, 0)

        if (arguments == null) {
            val strings = resources.getStringArray(R.array.intro_content)
            explanations = Array(1) { TextView(activity) }
            initExplanations(explanations, strings, layoutParams)
            layout.addView(explanations[0])
        }
        when (arguments?.getString("key") ?: "intro") {
            "intro" -> {
                val strings = resources.getStringArray(R.array.intro_content)
                explanations = Array(1) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                layout.addView(explanations[0])
            }

            "menu_1_1" -> {
                val strings = resources.getStringArray(R.array.explanation_1_1)
                explanations = Array(1) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                layout.addView(explanations[0])
            }

            "menu_1_2" -> {
                val strings = resources.getStringArray(R.array.explanation_1_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.student_java,
                    R.drawable.student_kotlin,
                    R.drawable.length_java,
                    R.drawable.length_kotlin
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                for (i in 1..3) {
                    layout.addView(images[i])
                    layout.addView(explanations[i])
                }
            }

            "menu_2_1" -> {
                val strings = resources.getStringArray(R.array.explanation_2_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.hello_world_kotlin)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_2_2" -> {
                val strings = resources.getStringArray(R.array.explanation_2_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.variable1,
                    R.drawable.variable2,
                    R.drawable.variable3,
                    R.drawable.variable4,
                    R.drawable.variable5
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                for (i in 3..4) {
                    layout.addView(images[i])
                    layout.addView(explanations[i])
                }
            }

            "menu_2_3" -> {
                val strings = resources.getStringArray(R.array.explanation_2_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.integer_data_type,
                    R.drawable.float_data_type,
                    R.drawable.char_data_type,
                    R.drawable.boolean_data_type
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_2_4" -> {
                val strings = resources.getStringArray(R.array.explanation_2_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.standard_output,
                    R.drawable.standard_output_result,
                    R.drawable.readline,
                    R.drawable.readline_result,
                    R.drawable.scanner,
                    R.drawable.scanner_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(images[3])
                layout.addView(explanations[2])
                layout.addView(images[4])
                layout.addView(images[5])
                layout.addView(explanations[3])
            }

            "menu_2_5" -> {
                val strings = resources.getStringArray(R.array.explanation_2_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.arithmetic_operators,
                    R.drawable.relation_operators,
                    R.drawable.assignment_operators,
                    R.drawable.augmented_operators,
                    R.drawable.logical_operators,
                    R.drawable.bitwise_operators,
                    R.drawable.signed_operators
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..6) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_2_6" -> {
                val strings = resources.getStringArray(R.array.explanation_2_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.function_with_block,
                    R.drawable.function_with_expression,
                    R.drawable.function_with_expression_type_inference
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
            }

            "menu_3_1" -> {
                val strings = resources.getStringArray(R.array.explanation_3_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.if_expression,
                    R.drawable.java_if,
                    R.drawable.if_return_expression,
                    R.drawable.if_return_block,
                    R.drawable.if_elseif_else
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                for (i in 2..4) {
                    layout.addView(images[i])
                    layout.addView(explanations[i])
                }
            }

            "menu_3_2" -> {
                val strings = resources.getStringArray(R.array.explanation_3_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.`when`,
                    R.drawable.when_result,
                    R.drawable.when_without_parameter,
                    R.drawable.when_multiple
                )
                images = Array(4) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
            }

            "menu_3_3" -> {
                val strings = resources.getStringArray(R.array.explanation_3_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.when_in)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_3_4" -> {
                val strings = resources.getStringArray(R.array.explanation_3_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.smart_cast)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
            }

            "menu_3_5" -> {
                val strings = resources.getStringArray(R.array.explanation_3_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.while_kotlin)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
            }

            "menu_3_6" -> {
                val strings = resources.getStringArray(R.array.explanation_3_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.for_range,
                    R.drawable.for_range_result,
                    R.drawable.for_string,
                    R.drawable.for_string_result,
                    R.drawable.for_array,
                    R.drawable.for_array_result,
                    R.drawable.for_collection,
                    R.drawable.for_collection_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_3_7" -> {
                val strings = resources.getStringArray(R.array.explanation_3_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.break_unlabelled,
                    R.drawable.break_unlabelled_result,
                    R.drawable.break_labelled,
                    R.drawable.break_labelled_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_3_8" -> {
                val strings = resources.getStringArray(R.array.explanation_3_8)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.continue_unlabelled,
                    R.drawable.continue_unlabelled_result,
                    R.drawable.continue_labelled,
                    R.drawable.continue_labelled_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_4_1" -> {
                val strings = resources.getStringArray(R.array.explanation_4_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.try_catch_finally)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_4_2" -> {
                val strings = resources.getStringArray(R.array.explanation_4_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.throw_kotlin,
                    R.drawable.throw_expression_kotlin
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_4_3" -> {
                val strings = resources.getStringArray(R.array.explanation_4_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.try_expression,
                    R.drawable.try_expression_result1,
                    R.drawable.try_expression_result2
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_5_1" -> {
                val strings = resources.getStringArray(R.array.explanation_5_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.string_declaration,
                    R.drawable.string_declaration_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_5_2" -> {
                val strings = resources.getStringArray(R.array.explanation_5_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                Linkify.addLinks(explanations[8], Linkify.WEB_URLS)
                explanations[8].linksClickable = true
                explanations[8].gravity = Gravity.CENTER_HORIZONTAL

                val drawables = intArrayOf(
                    R.drawable.string_length,
                    R.drawable.string_length_result,
                    R.drawable.string_get,
                    R.drawable.string_get_result,
                    R.drawable.string_equals,
                    R.drawable.string_equals_result,
                    R.drawable.string_substring_subsequence,
                    R.drawable.string_substring_subsequence_result,
                    R.drawable.string_indexof,
                    R.drawable.string_indexof_result,
                    R.drawable.string_contains,
                    R.drawable.string_contains_result,
                    R.drawable.string_replace,
                    R.drawable.string_replace_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..6) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[7])
                layout.addView(explanations[8])
            }

            "menu_5_3" -> {
                val strings = resources.getStringArray(R.array.explanation_5_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.string_iteration_index,
                    R.drawable.string_iteration_index_result,
                    R.drawable.string_iteration_iterator,
                    R.drawable.string_iteration_iterator_result,
                    R.drawable.string_iteration_foreach,
                    R.drawable.string_iteration_foreach_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[3])
            }

            "menu_5_4" -> {
                val strings = resources.getStringArray(R.array.explanation_5_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.escape_characters)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
            }

            "menu_5_5" -> {
                val strings = resources.getStringArray(R.array.explanation_5_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.meta_characters,
                    R.drawable.regex_constructor,
                    R.drawable.regex_find,
                    R.drawable.regex_find_result,
                    R.drawable.regex_findall,
                    R.drawable.regex_findall_result,
                    R.drawable.string_split,
                    R.drawable.string_split_result,
                    R.drawable.string_split_delimiters,
                    R.drawable.string_split_delimiters_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                for (i in 2..5) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i - 1) * 2])
                    layout.addView(images[(i - 1) * 2 + 1])
                }
            }

            "menu_6_1" -> {
                val strings = resources.getStringArray(R.array.explanation_6_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array,
                    R.drawable.array_type_inference,
                    R.drawable.arrayof,
                    R.drawable.arrayofnulls
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_6_2" -> {
                val strings = resources.getStringArray(R.array.explanation_6_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.primitive_array,
                    R.drawable.primitive_array_lambda,
                    R.drawable.primitive_arrayof
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_6_3" -> {
                val strings = resources.getStringArray(R.array.explanation_6_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array_iteration_index,
                    R.drawable.array_iteration_index_result,
                    R.drawable.array_iteration_iterator,
                    R.drawable.array_iteration_iterator_result,
                    R.drawable.array_iteration_foreach,
                    R.drawable.array_iteration_foreach_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_6_4" -> {
                val strings = resources.getStringArray(R.array.explanation_6_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array2d,
                    R.drawable.array2d_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
            }

            "menu_6_5" -> {
                val strings = resources.getStringArray(R.array.explanation_6_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array_size,
                    R.drawable.array_size_result,
                    R.drawable.array_indexof,
                    R.drawable.array_indexof_result,
                    R.drawable.array_sum,
                    R.drawable.array_sum_result,
                    R.drawable.array_average,
                    R.drawable.array_average_result,
                    R.drawable.array_first,
                    R.drawable.array_first_result,
                    R.drawable.array_last,
                    R.drawable.array_last_result,
                    R.drawable.array_find,
                    R.drawable.array_find_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..6) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_6_6" -> {
                val strings = resources.getStringArray(R.array.explanation_6_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array_count,
                    R.drawable.array_count_result,
                    R.drawable.array_contains,
                    R.drawable.array_contains_result,
                    R.drawable.array_max_min,
                    R.drawable.array_max_min_result,
                    R.drawable.array_reverse,
                    R.drawable.array_reverse_result,
                    R.drawable.array_jointostring,
                    R.drawable.array_jointostring_result,
                    R.drawable.array_slicearray,
                    R.drawable.array_slicearray_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..5) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_6_7" -> {
                val strings = resources.getStringArray(R.array.explanation_6_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.array_sort,
                    R.drawable.array_sort_result,
                    R.drawable.array_sortedarray,
                    R.drawable.array_sortedarray_result,
                    R.drawable.array_sortby,
                    R.drawable.array_sortby_result,
                    R.drawable.array_sortwith,
                    R.drawable.array_sortwith_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_7_1" -> {
                val strings = resources.getStringArray(R.array.explanation_7_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.function_sum,
                    R.drawable.function_sum_expression,
                    R.drawable.function_calling,
                    R.drawable.function_calling_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(images[3])
            }

            "menu_7_2" -> {
                val strings = resources.getStringArray(R.array.explanation_7_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.function_named_arguments,
                    R.drawable.function_named_arguments_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_7_3" -> {
                val strings = resources.getStringArray(R.array.explanation_7_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.function_default,
                    R.drawable.function_default_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_7_4" -> {
                val strings = resources.getStringArray(R.array.explanation_7_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                layout.addView(explanations[0])
            }

            "menu_7_5" -> {
                val strings = resources.getStringArray(R.array.explanation_7_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.extension_function_string_second,
                    R.drawable.extension_function_string_second_result,
                    R.drawable.extension_function_string_second_without_this
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
            }

            "menu_7_6" -> {
                val strings = resources.getStringArray(R.array.explanation_7_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.vararg,
                    R.drawable.vararg_result,
                    R.drawable.vararg_spread,
                    R.drawable.vararg_spread_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_7_7" -> {
                val strings = resources.getStringArray(R.array.explanation_7_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.infix,
                    R.drawable.infix_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_8_1" -> {
                val strings = resources.getStringArray(R.array.explanation_8_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.class_syntax,
                    R.drawable.class_property,
                    R.drawable.class_student_example
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[3])
            }

            "menu_8_2" -> {
                val strings = resources.getStringArray(R.array.explanation_8_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.class_custom1,
                    R.drawable.class_custom2
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_8_3" -> {
                val strings = resources.getStringArray(R.array.explanation_8_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.class_getter_setter,
                    R.drawable.class_getter_setter_auto,
                    R.drawable.class_custom_getter_setter,
                    R.drawable.class_custom_getter_setter_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(images[3])
            }

            "menu_8_4" -> {
                val strings = resources.getStringArray(R.array.explanation_8_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.interface_kotlin,
                    R.drawable.interface_kotlin_property,
                    R.drawable.interface_implemented,
                    R.drawable.interface_super
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[4])
            }

            "menu_8_5" -> {
                val strings = resources.getStringArray(R.array.explanation_8_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.class_open,
                    R.drawable.class_override_open,
                    R.drawable.class_abstract,
                    R.drawable.class_inheritance_keyword
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_8_6" -> {
                val strings = resources.getStringArray(R.array.explanation_8_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.visibility_modifier)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_8_7" -> {
                val strings = resources.getStringArray(R.array.explanation_8_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.nestedclass_error,
                    R.drawable.innerclass,
                    R.drawable.nestedclass_vs_innerclass
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_8_8" -> {
                val strings = resources.getStringArray(R.array.explanation_8_8)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.sealed_class)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_8_9" -> {
                val strings = resources.getStringArray(R.array.explanation_8_9)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.primary_constructor_init,
                    R.drawable.primary_constructor_init_result,
                    R.drawable.primary_constructor_without_init,
                    R.drawable.primary_constructor_without_init_constructor,
                    R.drawable.primary_constructor_visibility_modifier,
                    R.drawable.primary_constructor,
                    R.drawable.primary_constructor_default_value,
                    R.drawable.primary_constructor_inheritance,
                    R.drawable.primary_constructor_inheritance_default_constructor
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                var index = 0
                for (i in 0..7) {
                    layout.addView(explanations[i])
                    when (i) {
                        0, 2 -> {
                            layout.addView(images[index++])
                            layout.addView(images[index++])
                        }
                        7 -> {}
                        else -> layout.addView(images[index++])
                    }
                }
            }

            "menu_8_10" -> {
                val strings = resources.getStringArray(R.array.explanation_8_10)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.secondary_constructor,
                    R.drawable.secondary_constructor_result,
                    R.drawable.secondary_constructor_this,
                    R.drawable.secondary_constructor_this_result,
                    R.drawable.secondary_constructor_super,
                    R.drawable.secondary_constructor_super_result,
                    R.drawable.secondary_constructor_primary
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[3])
                layout.addView(images[6])
            }

            "menu_8_11" -> {
                val strings = resources.getStringArray(R.array.explanation_8_11)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.data_class,
                    R.drawable.data_class_tostring,
                    R.drawable.data_class_tostring_result,
                    R.drawable.class_tostring,
                    R.drawable.class_tostring_result,
                    R.drawable.data_class_equals,
                    R.drawable.data_class_equals_result,
                    R.drawable.class_equals_override,
                    R.drawable.class_equals_override_result,
                    R.drawable.class_hashcode_false,
                    R.drawable.class_hashcode_false_result,
                    R.drawable.class_hashcode_true,
                    R.drawable.class_hashcode_true_result,
                    R.drawable.class_copy
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                for (i in 1..6) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2) - 1])
                    layout.addView(images[(i * 2)])
                }
                layout.addView(explanations[7])
                layout.addView(images[13])
            }

            "menu_8_12" -> {
                val strings = resources.getStringArray(R.array.explanation_8_12)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.decorator_pattern,
                    R.drawable.decorator_pattern_by
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[2])
            }

            "menu_8_13" -> {
                val strings = resources.getStringArray(R.array.explanation_8_13)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.singleton,
                    R.drawable.singleton_result,
                    R.drawable.companion_object,
                    R.drawable.companion_object_result,
                    R.drawable.factory_method_secondary_constructor,
                    R.drawable.factory_method_secondary_constructor_result,
                    R.drawable.factory_method_companion_object,
                    R.drawable.factory_method_companion_object_result,
                    R.drawable.companion_object_extension,
                    R.drawable.companion_object_extension_result,
                    R.drawable.companion_object_extension_with_name,
                    R.drawable.companion_object_extension_with_name_result,
                    R.drawable.anonymous_object,
                    R.drawable.anonymous_object_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..6) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[7])
            }

            "menu_8_14" -> {
                val strings = resources.getStringArray(R.array.explanation_8_14)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.enum_class,
                    R.drawable.enum_class_result,
                    R.drawable.enum_class_property,
                    R.drawable.enum_class_property_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_9_1" -> {
                val strings = resources.getStringArray(R.array.explanation_9_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.collections)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
            }

            "menu_9_2" -> {
                val strings = resources.getStringArray(R.array.explanation_9_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                Linkify.addLinks(explanations[5], Linkify.WEB_URLS)
                explanations[5].linksClickable = true
                explanations[5].gravity = Gravity.CENTER_HORIZONTAL

                val drawables = intArrayOf(
                    R.drawable.list,
                    R.drawable.list_add,
                    R.drawable.list_add_result,
                    R.drawable.list_remove,
                    R.drawable.list_remove_result,
                    R.drawable.list_set,
                    R.drawable.list_set_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                for (i in 1..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2) - 1])
                    layout.addView(images[(i * 2)])
                }
                layout.addView(explanations[4])
                layout.addView(explanations[5])
            }

            "menu_9_3" -> {
                val strings = resources.getStringArray(R.array.explanation_9_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                Linkify.addLinks(explanations[4], Linkify.WEB_URLS)
                explanations[4].linksClickable = true
                explanations[4].gravity = Gravity.CENTER_HORIZONTAL

                val drawables = intArrayOf(
                    R.drawable.set,
                    R.drawable.set_add,
                    R.drawable.set_add_result,
                    R.drawable.set_remove,
                    R.drawable.set_remove_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
                layout.addView(images[4])
                layout.addView(explanations[3])
                layout.addView(explanations[4])
            }

            "menu_9_4" -> {
                val strings = resources.getStringArray(R.array.explanation_9_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)
                Linkify.addLinks(explanations[4], Linkify.WEB_URLS)
                explanations[4].linksClickable = true
                explanations[4].gravity = Gravity.CENTER_HORIZONTAL

                val drawables = intArrayOf(
                    R.drawable.map,
                    R.drawable.map_put,
                    R.drawable.map_put_result,
                    R.drawable.map_remove,
                    R.drawable.map_remove_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
                layout.addView(images[4])
                layout.addView(explanations[3])
                layout.addView(explanations[4])
            }

            "menu_10_1" -> {
                val strings = resources.getStringArray(R.array.explanation_10_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.lambda_variable,
                    R.drawable.lambda_variable_result,
                    R.drawable.lambda_type_inference1,
                    R.drawable.lambda_type_inference2,
                    R.drawable.lambda_multilines,
                    R.drawable.lambda_multilines_result,
                    R.drawable.lambda_parameter_only,
                    R.drawable.lambda_parameter_only_result,
                    R.drawable.lambda_it,
                    R.drawable.lambda_it_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..4) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_10_2" -> {
                val strings = resources.getStringArray(R.array.explanation_10_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.member_reference,
                    R.drawable.member_reference_result,
                    R.drawable.member_reference_top_level,
                    R.drawable.member_reference_top_level_result,
                    R.drawable.constructor_reference,
                    R.drawable.constructor_reference_result,
                    R.drawable.member_reference_extension_function,
                    R.drawable.member_reference_extension_function_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_10_3" -> {
                val strings = resources.getStringArray(R.array.explanation_10_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.filter,
                    R.drawable.filter_result,
                    R.drawable.lambda_map,
                    R.drawable.lambda_map_result,
                    R.drawable.lambda_map_key,
                    R.drawable.lambda_map_key_result,
                    R.drawable.lambda_map_value,
                    R.drawable.lambda_map_value_result,
                    R.drawable.lambda_all_any,
                    R.drawable.lambda_all_any_result,
                    R.drawable.lambda_count,
                    R.drawable.lambda_count_result,
                    R.drawable.lambda_find,
                    R.drawable.lambda_find_result,
                    R.drawable.lambda_groupby,
                    R.drawable.lambda_groupby_result,
                    R.drawable.lambda_flatmap,
                    R.drawable.lambda_flatmap_result,
                    R.drawable.lambda_flatten,
                    R.drawable.lambda_flatten_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..9) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_10_4" -> {
                val strings = resources.getStringArray(R.array.explanation_10_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.lambda_filter_map,
                    R.drawable.lambda_filter_map_result,
                    R.drawable.assequence,
                    R.drawable.assequence_result,
                    R.drawable.assequence_without_final,
                    R.drawable.assequence_without_final_result,
                    R.drawable.non_sequence_vs_sequence,
                    R.drawable.non_sequence_vs_sequence_result,
                    R.drawable.generatesequence,
                    R.drawable.generatesequence_result
                )
                images = Array(10) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..4) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_10_5" -> {
                val strings = resources.getStringArray(R.array.explanation_10_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.functional_interface_anonymous_object,
                    R.drawable.functional_interface_lambda
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[2])
            }

            "menu_10_6" -> {
                val strings = resources.getStringArray(R.array.explanation_10_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.with,
                    R.drawable.with_result,
                    R.drawable.with_this,
                    R.drawable.with_this_result,
                    R.drawable.apply,
                    R.drawable.apply_result,
                    R.drawable.buildstring,
                    R.drawable.buildstring_result,
                    R.drawable.let,
                    R.drawable.let_result,
                    R.drawable.let_null_check,
                    R.drawable.let_null_check_result,
                    R.drawable.run,
                    R.drawable.run_result,
                    R.drawable.also,
                    R.drawable.also_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..7) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_11_1" -> {
                val strings = resources.getStringArray(R.array.explanation_11_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.nullable_type,
                    R.drawable.nullable_type_limitation,
                    R.drawable.nullable_type_null_check
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[3])
            }

            "menu_11_2" -> {
                val strings = resources.getStringArray(R.array.explanation_11_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.safe_call,
                    R.drawable.safe_call_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_11_3" -> {
                val strings = resources.getStringArray(R.array.explanation_11_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.elvis_operator,
                    R.drawable.elvis_operator_result,
                    R.drawable.elvis_operator_with_safe_call,
                    R.drawable.elvis_operator_with_safe_call_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_11_4" -> {
                val strings = resources.getStringArray(R.array.explanation_11_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.as_operator1,
                    R.drawable.as_operator2,
                    R.drawable.classcastexception,
                    R.drawable.classcastexception_result,
                    R.drawable.as_operator3,
                    R.drawable.as_operator3_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                for (i in 2..3) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2) - 2])
                    layout.addView(images[(i * 2) - 1])
                }
            }

            "menu_11_5" -> {
                val strings = resources.getStringArray(R.array.explanation_11_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.not_null_assertion_operator,
                    R.drawable.not_null_assertion_operator_result,
                    R.drawable.not_null_assertion_operator_nullpointerexception,
                    R.drawable.not_null_assertion_operator_nullpointerexception_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[2])
            }

            "menu_11_6" -> {
                val strings = resources.getStringArray(R.array.explanation_11_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.let_with_safe_call,
                    R.drawable.let_with_safe_call_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_11_7" -> {
                val strings = resources.getStringArray(R.array.explanation_11_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.lateinit_null,
                    R.drawable.lateinit_var
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[2])
            }

            "menu_11_8" -> {
                val strings = resources.getStringArray(R.array.explanation_11_8)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.nullable_type_extension1,
                    R.drawable.nullable_type_extension1_result,
                    R.drawable.nullable_type_extension2,
                    R.drawable.nullable_type_extension2_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[2])
            }

            "menu_12_1" -> {
                val strings = resources.getStringArray(R.array.explanation_12_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.java_wrapper_class,
                    R.drawable.kotlin_wrapper_class
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_12_2" -> {
                val strings = resources.getStringArray(R.array.explanation_12_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.type_conversion_error,
                    R.drawable.type_conversion,
                    R.drawable.type_conversion_example,
                    R.drawable.type_conversion_exception,
                    R.drawable.type_conversion_exception_result,
                    R.drawable.number_literal
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
                layout.addView(explanations[3])
                layout.addView(images[3])
                layout.addView(images[4])
                layout.addView(explanations[4])
                layout.addView(images[5])
            }

            "menu_12_3" -> {
                val strings = resources.getStringArray(R.array.explanation_12_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.any,
                    R.drawable.any_methods,
                    R.drawable.any_methods_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
            }

            "menu_12_4" -> {
                val strings = resources.getStringArray(R.array.explanation_12_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.unit,
                    R.drawable.unit_generic_parameter,
                    R.drawable.unit_singleton
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..2) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_12_5" -> {
                val strings = resources.getStringArray(R.array.explanation_12_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(R.drawable.nothing)
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
            }

            "menu_13_1" -> {
                val strings = resources.getStringArray(R.array.explanation_13_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.operator,
                    R.drawable.operator_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_13_2" -> {
                val strings = resources.getStringArray(R.array.explanation_13_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.binary_operator_overloading,
                    R.drawable.binary_operator_overloading_example,
                    R.drawable.binary_operator_overloading_different_type,
                    R.drawable.binary_operator_overloading_different_type_result,
                    R.drawable.compound_assignment_operator,
                    R.drawable.compound_assignment_operator_example,
                    R.drawable.compound_assignment_operator_example_result,
                    R.drawable.unary_operator
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                var index = 0
                for (i in 0..5) {
                    layout.addView(explanations[i])
                    when (i) {
                        2, 4 -> {
                            for (j in 0..1) {
                                layout.addView(images[index++])
                            }
                        }
                        else -> layout.addView(images[index++])
                    }
                }
            }

            "menu_13_3" -> {
                val strings = resources.getStringArray(R.array.explanation_13_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.equals_example,
                    R.drawable.equals_example_result,
                    R.drawable.compareto_example,
                    R.drawable.compareto_example_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[2])
            }

            "menu_13_4" -> {
                val strings = resources.getStringArray(R.array.explanation_13_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.get_set_example,
                    R.drawable.get_set_example_result,
                    R.drawable.get_key_example,
                    R.drawable.get_key_example_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_13_5" -> {
                val strings = resources.getStringArray(R.array.explanation_13_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.in_operator_example,
                    R.drawable.in_operator_example_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
            }

            "menu_14_1" -> {
                val strings = resources.getStringArray(R.array.explanation_14_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.function_type,
                    R.drawable.function_type_result,
                    R.drawable.function_type_unit,
                    R.drawable.function_type_unit_result,
                    R.drawable.function_type_null
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[2])
                layout.addView(images[4])
            }

            "menu_14_2" -> {
                val strings = resources.getStringArray(R.array.explanation_14_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.higher_order_function1,
                    R.drawable.higher_order_function1_result,
                    R.drawable.higher_order_function_default_value,
                    R.drawable.higher_order_function_default_value_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_14_3" -> {
                val strings = resources.getStringArray(R.array.explanation_14_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.higher_order_function2,
                    R.drawable.higher_order_function2_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_14_4" -> {
                val strings = resources.getStringArray(R.array.explanation_14_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.inline_function,
                    R.drawable.inline_function_result,
                    R.drawable.inline_function_decompile,
                    R.drawable.no_inline_function_decompile
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
                layout.addView(explanations[2])
            }

            "menu_14_5" -> {
                val strings = resources.getStringArray(R.array.explanation_14_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.inline_function_error,
                    R.drawable.noinline,
                    R.drawable.noinline_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
            }

            "menu_14_6" -> {
                val strings = resources.getStringArray(R.array.explanation_14_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.crossinline_error,
                    R.drawable.crossinline
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_15_1" -> {
                val strings = resources.getStringArray(R.array.explanation_15_1)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.generics_type_parameter,
                    R.drawable.generics_type_parameter_type_inference
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[i])
                }
            }

            "menu_15_2" -> {
                val strings = resources.getStringArray(R.array.explanation_15_2)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.generic_function,
                    R.drawable.generic_function_result,
                    R.drawable.generic_parameter,
                    R.drawable.generic_parameter_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                for (i in 0..1) {
                    layout.addView(explanations[i])
                    layout.addView(images[(i * 2)])
                    layout.addView(images[(i * 2) + 1])
                }
            }

            "menu_15_3" -> {
                val strings = resources.getStringArray(R.array.explanation_15_3)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.generic_class,
                    R.drawable.generic_class_result,
                    R.drawable.generic_class_inheritance
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
            }

            "menu_15_4" -> {
                val strings = resources.getStringArray(R.array.explanation_15_4)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.type_parameter_constraint_error,
                    R.drawable.type_parameter_constraint,
                    R.drawable.type_parameter_constraint_result,
                    R.drawable.type_parameter_constraint_where,
                    R.drawable.type_parameter_constraint_where_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
                layout.addView(images[4])
                layout.addView(explanations[3])
            }

            "menu_15_5" -> {
                val strings = resources.getStringArray(R.array.explanation_15_5)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.type_parameter_is_error,
                    R.drawable.non_type_parameter_is,
                    R.drawable.non_type_parameter_is_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(explanations[1])
                layout.addView(images[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
            }

            "menu_15_6" -> {
                val strings = resources.getStringArray(R.array.explanation_15_6)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.reified,
                    R.drawable.reified_result
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
            }

            "menu_15_7" -> {
                val strings = resources.getStringArray(R.array.explanation_15_7)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.variance_invariance,
                    R.drawable.variance_invariance_result,
                    R.drawable.variance_invariance_error
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
            }

            "menu_15_8" -> {
                val strings = resources.getStringArray(R.array.explanation_15_8)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.variance_covariance,
                    R.drawable.variance_covariance_result,
                    R.drawable.variance_covariance_out,
                    R.drawable.variance_covariance_out_constructor
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
            }

            "menu_15_9" -> {
                val strings = resources.getStringArray(R.array.explanation_15_9)
                explanations = Array(strings.size) { TextView(activity) }
                initExplanations(explanations, strings, layoutParams)

                val drawables = intArrayOf(
                    R.drawable.variance_contravariance,
                    R.drawable.variance_contravariance_result,
                    R.drawable.variance_contravariance_in,
                    R.drawable.variance_contravariance_in_constructor
                )
                images = Array(drawables.size) { ImageView(activity) }
                initImages(images, drawables, layoutParams)

                layout.addView(explanations[0])
                layout.addView(images[0])
                layout.addView(images[1])
                layout.addView(explanations[1])
                layout.addView(images[2])
                layout.addView(explanations[2])
                layout.addView(images[3])
            }

            else -> {}
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initExplanations(
        explanations: Array<TextView>,
        strings: Array<String>,
        layoutParams: LinearLayoutCompat.LayoutParams
    ) {
        for (i in strings.indices) {
            explanations[i].text = strings[i]
            explanations[i].layoutParams = layoutParams
            when (arguments?.getString("size") ?: "small") {
                "small" -> explanations[i].textSize = 16.0f
                "middle" -> explanations[i].textSize = 22.0f
                "large" -> explanations[i].textSize = 28.0f
            }
        }
    }

    private fun initImages(
        images: Array<ImageView>,
        drawables: IntArray,
        layoutParams: LinearLayoutCompat.LayoutParams
    ) {
        for (i in images.indices) {
            images[i].layoutParams = layoutParams
            images[i].scaleType = ImageView.ScaleType.FIT_START
            images[i].setImageDrawable(ResourcesCompat.getDrawable(resources, drawables[i], null))
        }
    }

    fun textResize(textSize: String) {
        val size = when (textSize) {
            "small" -> 16.0f
            "middle" -> 22.0f
            "large" -> 28.0f
            else -> 16.0f
        }
        for (explanation in explanations) {
            explanation.textSize = size
        }
    }
}