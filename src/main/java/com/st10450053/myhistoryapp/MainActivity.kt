package com.st10450053.myhistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /* Declarations */


        val generateButton = findViewById<Button>(R.id.generateButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val NumTextNumber = findViewById<EditText>(R.id.NumTextNumber)
        val ResultTextView = findViewById<TextView>(R.id.ResultTextView)
        generateButton.setOnClickListener{
    }
            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if ( age == null) {
               ResultTextView.text = "Please enter a valid age"

            } else {

            if (age < 30 || age > 90){
                ResultTextView.text = "please enter a valid age between 30 and 90"
                NumTextNumber.text.clear()
            } else {
                /* 10 Famous people i have chosen */
                val result = when (age) {
                    44 -> "PABLO ESCOBAR (born December 1, 1949, Rionegro, Colombia—died December 2, 1993, Medellín. Colombia) was a Colombian drug lord who rose to infamy as the leader of the Medellín cartel, overseeing a period marked by extreme violence, corruption, and wealth. Escobar was arguably the world’s most powerful drug trafficker in the 1980s and early ’90s."
                    56 -> "ADOLF HITLER  (born April 20, 1889, Braunau am Inn, Austria—died April 30, 1945, Berlin, Germany) was the leader of the Nazi Party (from 1920/21) and chancellor (Kanzler) and Führer of Germany (1933–45). His worldview revolved around two concepts: territorial expansion and racial supremacy. Those themes informed his decision to invade Poland, which marked the start of World War II, as well as the systematic killing of six million Jews and millions of others during the Holocaust."
                    39 -> "MARTIN LUTHER KING JR Born: 15 January 1929, Assassinated: 4 April 1968 was an American Christian minister, activist, and political philosopher who was one of the most prominent leaders in the civil rights movement from 1955 until his assassination in 1968."
                    95 -> "Nelson Rolihlahla Mandela Born: 18 July 1918, Died: 5 December 2013was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
                    84 -> "KARL BENZ Born: 25 November 1844 Died: 4 April 1929 (age 84 years) Carl Friedrich Benz  was a German engine designer and automotive engineer. His Benz Patent Motorcar from 1885 is considered the first practical modern automobile and first car put into series production. He received a patent for the motorcar in 1886, the same year he first publicly drove the Benz Patent-Motorwagen."
                    30 -> "Steve Biko, Born: 18 December 1946, Died: 12 September 1977 one of the most prominent leaders in the anti-apartheid struggle, died in police detention on September 12, 1977. He was imprisoned on charges of terrorism. The South African Minister of Police announced that he died after a seven-day hunger strike. Riots ensued in the aftermath of this statement, and a few students were killed in the protests. Fifteen thousand people showed up to Biko’s funeral, including foreign dignitaries, African diplomats, and about 13 Western diplomats."
                    74 -> "MUHAMMED ALI Born: 17 January 1942, Died: 3 June 2016 was a boxer, philanthropist, and social activist who is universally regarded as one of the greatest athletes of the 20th century. Ali became an Olympic gold medallist in 1960 and the world heavyweight boxing champion in 1964."
                    83 -> "HENRY FORD Born: 30 July 1863, Died: 7 April 1947 was an American industrialist and business magnate. As founder of the Ford Motor Company, he is credited as a pioneer in making automobiles affordable for middle-class Americans through the Fordism system."
                    76 -> "ALBERT EINSTIEN Born: 14 March 1879, Died: 18 April 1955 German-born physicist who developed the special and general theories of relativity and won the Nobel Prize for Physics in 1921 for his explanation of the photoelectric effect. Einstein is generally considered the most influential physicist of the 20th century."
                    56 -> "ABRAHAM LINCOLN Born: 12 February 1809, Assassinated: 15 April 1865 was an American lawyer, politician, and statesman, who served as the 16th president of the United States, from 1861 until his assassination in 1865."


                    else -> "Sorry,no one has passed away at this age, try another age."
                }
                ResultTextView.text = result

            }
                clearButton.setOnClickListener {
                    NumTextNumber.text.clear()
                    ResultTextView.text = ""

                }
            }
        }}