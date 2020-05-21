using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace Ejercicio01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<String>() {"Aqua", "Purpura", "Naranja"};
        }

        private void buttonRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void buttonBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void buttonGreen_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + textBox1.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String aqua = "#00ffd0", purpura = "#7e2181", naranja = "#ff6f00";
            switch(comboBox1.SelectedIndex)
            {
                case 0:
                    BackColor = ColorTranslator.FromHtml(aqua);
                    break;
                case 1:
                    BackColor = ColorTranslator.FromHtml(purpura);
                    break;
                case 2: 
                    BackColor = ColorTranslator.FromHtml(naranja); 
                    break;
            }
        }
    }
}