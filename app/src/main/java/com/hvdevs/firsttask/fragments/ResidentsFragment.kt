package com.hvdevs.firsttask.fragments

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.hvdevs.firsttask.R


class ResidentsFragment : Fragment() {

    private lateinit var categoryadapter: ArrayAdapter<String>
    private lateinit var localityadapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view: View = inflater.inflate(R.layout.fragment_residents, container, false)

        val text1 = view.findViewById<TextView>(R.id.txtCat)
        val temp = "Category "
        val tempadd = "*"
        val builder = SpannableStringBuilder(temp+tempadd)

        builder.setSpan(
            ForegroundColorSpan(Color.RED), temp.length, builder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        text1.text = builder

        val text2 = view.findViewById<TextView>(R.id.txtLoc)
        val temp2 = "Locality "
        val tempadd2 = "*"
        val builder2 = SpannableStringBuilder(temp2+tempadd2)

        builder2.setSpan(
            ForegroundColorSpan(Color.RED), temp2.length, builder2.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        text2.text = builder2

        val text3 = view.findViewById<TextView>(R.id.txtCom)
        val temp3 = "Comments "
        val tempadd3 = "*"
        val builder3 = SpannableStringBuilder(temp3+tempadd3)

        builder3.setSpan(
            ForegroundColorSpan(Color.RED), temp3.length, builder3.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        text3.text = builder3

        val category = java.util.ArrayList<String>()
        category.add("Select Category")
        category.add("item 1")
        category.add("item 2")

        val locality = java.util.ArrayList<String>()
        locality.add("Select Locality")
        locality.add("item 1")
        locality.add("item 2")

        val categorySpinner = view.findViewById<Spinner>(R.id.Category)
        val localitySpinner = view.findViewById<Spinner>(R.id.Locality)

        categoryadapter = ArrayAdapter<String>(
            this.requireContext(), android.R.layout.simple_spinner_dropdown_item,
            category
        )
        categorySpinner.adapter = categoryadapter


        localityadapter = ArrayAdapter<String>(
            this.requireContext(), android.R.layout.simple_spinner_dropdown_item,
            locality
        )
        localitySpinner.adapter = localityadapter

        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        localitySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        return view

    }

}