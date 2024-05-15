import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("unused")
public class Main extends JPanel implements ActionListener {
    private JButton btn_calcularIMC;
    private JTextField ing_Est;
    private JTextField ing_Peso;
    private JTextField res_IMC;
    private JTextField ing_P1;
    private JTextField ing_P2;
    private JTextField ing_P3;
    private JTextField res_TDR;
    private JButton btn_calcularTDR;
    private JLabel tex_est;
    private JLabel tex_peso;
    private JLabel txt_imc;
    private JLabel txt_p1;
    private JLabel txt_p2;
    private JLabel txt_p3;
    private JLabel txt_tdr;
    private JLabel txt_Ans;
    private JLabel txt_Ans2;
    private double RIMC;
    private double RTDR;
    private JButton Env_Form;
    private JLabel Preg1;
    private JLabel Preg2;
    private JLabel Preg4;
    private JLabel Preg8;
    private JLabel Preg6;
    private JLabel Preg7;
    private JLabel Preg3;
    private JLabel Preg5;
    private JLabel P1_Op1;
    private JLabel P1_Op2;
    private JLabel P1_Op3;
    private JTextField RP1;
    private JTextField RP2;
    private JLabel P2_Op1;
    private JLabel P2_Op2;
    private JLabel P2_Op3;
    private JLabel P3_Op1;
    private JLabel P3_Op2;
    private JLabel P3_Op3;
    private JTextField RP3;
    private JLabel P4_Op1;
    private JLabel P4_Op2;
    private JLabel P4_Op3;
    private JTextField RP4;
    private JLabel P5_Op1;
    private JLabel P5_Op2;
    private JLabel P5_Op3;
    private JTextField RP5;
    private JLabel P6_Op1;
    private JLabel P6_Op3;
    private JLabel P6_Op2;
    private JTextField RP6;
    private JTextField RP7;
    private JLabel jcomp35;
    private JLabel P7_Op2;
    private JLabel P7_Op3;
    private JLabel P7_Op1;
    private JLabel P8_Op1;
    private JLabel P8_Op2;
    private JLabel P8_Op3;
    private JTextField RP8;
    private JLabel Preg9;
    private JTextField RP9;
    private JLabel P9_Op1;
    private JLabel P9_Op3;
    private JLabel P9_Op2;
    private JLabel Consejo;
    private JLabel Consejo1;
    private JLabel Consejo2;
    private JLabel Consejo3;
    private JLabel Consejo4;
    private int A = 0;
    private int B = 0;
    private int C = 0;

    public Main() {

        btn_calcularIMC = new JButton("Calcular");
        btn_calcularIMC.addActionListener(this);
        ing_Est = new JTextField(5);
        ing_Peso = new JTextField(5);
        res_IMC = new JTextField(5);
        ing_P1 = new JTextField(5);
        ing_P2 = new JTextField(5);
        ing_P3 = new JTextField(5);
        res_TDR = new JTextField(5);
        btn_calcularTDR = new JButton("Calcular");
        btn_calcularTDR.addActionListener(this);
        tex_est = new JLabel("Ingrese Estatura:");
        tex_peso = new JLabel("Ingrese Peso:");
        txt_imc = new JLabel("IMC");
        txt_p1 = new JLabel("Ingrese Pulsacion 1");
        txt_p2 = new JLabel("Ingrese Pulsacion 2");
        txt_p3 = new JLabel("Ingresar Pulsacion 3");
        txt_tdr = new JLabel("Test de ruffier");
        Env_Form = new JButton("Enviar");
        Env_Form.addActionListener(this);
        Preg1 = new JLabel("Cuantos vasos de agua toma al dia?");
        Preg2 = new JLabel("Cuantas veces come al dia?");
        Preg4 = new JLabel("Cuantas veces come comidas rapidas a la semana?");
        Preg8 = new JLabel("Cuantas veces consume frutas al dia?");
        Preg6 = new JLabel("Hace deporte?");
        Preg7 = new JLabel("Cuantas veces se ejercita al dia?");
        Preg3 = new JLabel("Cuantas veces consume proteinas(Carne,Pollo,pescado) al dia?");
        Preg5 = new JLabel("Con que frecuencia consume dulces?");
        P1_Op1 = new JLabel("A-Mas de 5");
        P1_Op2 = new JLabel("B-Entre 3 y 5");
        P1_Op3 = new JLabel("C-Menos de 3");
        RP1 = new JTextField(5);
        RP2 = new JTextField(5);
        P2_Op1 = new JLabel("A-3");
        P2_Op2 = new JLabel("B-Menos de 2");
        P2_Op3 = new JLabel("C- Mas de 3");
        P3_Op1 = new JLabel("A-3");
        P3_Op2 = new JLabel("B-2");
        P3_Op3 = new JLabel("C-1");
        RP3 = new JTextField(5);
        P4_Op1 = new JLabel("A-1");
        P4_Op2 = new JLabel("B- Entre 2 y 3");
        P4_Op3 = new JLabel("C-Mas de 3");
        RP4 = new JTextField(5);
        P5_Op1 = new JLabel("A-No consume ");
        P5_Op2 = new JLabel("B-1/dia o 2/dia");
        P5_Op3 = new JLabel("C-Mas de 3 diarios");
        RP5 = new JTextField(5);
        P6_Op1 = new JLabel("A-Si");
        P6_Op3 = new JLabel("C-No");
        P6_Op2 = new JLabel("B- A Veces");
        RP6 = new JTextField(5);
        RP7 = new JTextField(5);
        jcomp35 = new JLabel("A-3 o mas");
        P7_Op2 = new JLabel("B- Entre 1 y 2");
        P7_Op3 = new JLabel("C-No aplica");
        P7_Op1 = new JLabel("A-Mas de 3");
        P8_Op1 = new JLabel("A-Mas de 5");
        P8_Op2 = new JLabel("B- Entre 3 y 5");
        P8_Op3 = new JLabel("C- Menos de 3");
        RP8 = new JTextField(5);
        Preg9 = new JLabel("Desayunas todos los dias?");
        RP9 = new JTextField(5);
        P9_Op1 = new JLabel("A-Si");
        P9_Op3 = new JLabel("C-No");
        P9_Op2 = new JLabel("B- A veces");

        setPreferredSize(new Dimension(944, 637));
        setLayout(null);

        add(btn_calcularIMC);
        add(ing_Est);
        add(ing_Peso);
        add(res_IMC);
        add(ing_P1);
        add(ing_P2);
        add(ing_P3);
        add(res_TDR);
        add(btn_calcularTDR);
        add(tex_est);
        add(tex_peso);
        add(txt_imc);
        add(txt_p1);
        add(txt_p2);
        add(txt_p3);
        add(txt_tdr);
        add(Env_Form);
        add(Preg1);
        add(Preg2);
        add(Preg4);
        add(Preg8);
        add(Preg6);
        add(Preg7);
        add(Preg3);
        add(Preg5);
        add(P1_Op1);
        add(P1_Op2);
        add(P1_Op3);
        add(RP1);
        add(RP2);
        add(P2_Op1);
        add(P2_Op2);
        add(P2_Op3);
        add(P3_Op1);
        add(P3_Op2);
        add(P3_Op3);
        add(RP3);
        add(P4_Op1);
        add(P4_Op2);
        add(P4_Op3);
        add(RP4);
        add(P5_Op1);
        add(P5_Op2);
        add(P5_Op3);
        add(RP5);
        add(P6_Op1);
        add(P6_Op3);
        add(P6_Op2);
        add(RP6);
        add(RP7);
        add(jcomp35);
        add(P7_Op2);
        add(P7_Op3);
        add(P7_Op1);
        add(P8_Op1);
        add(P8_Op2);
        add(P8_Op3);
        add(RP8);
        add(Preg9);
        add(RP9);
        add(P9_Op1);
        add(P9_Op3);
        add(P9_Op2);

        btn_calcularIMC.setBounds(250, 330, 100, 20);
        ing_Est.setBounds(250, 230, 100, 25);
        ing_Peso.setBounds(250, 255, 100, 25);
        res_IMC.setBounds(250, 355, 125, 25);
        ing_P1.setBounds(500, 260, 100, 25);
        ing_P2.setBounds(500, 290, 100, 25);
        ing_P3.setBounds(500, 230, 100, 25);
        res_TDR.setBounds(500, 355, 100, 25);
        btn_calcularTDR.setBounds(500, 325, 100, 25);
        tex_est.setBounds(150, 230, 100, 25);
        tex_peso.setBounds(150, 255, 100, 25);
        txt_imc.setBounds(285, 205, 100, 25);
        txt_p1.setBounds(385, 230, 135, 25);
        txt_p2.setBounds(385, 260, 120, 25);
        txt_p3.setBounds(380, 290, 140, 25);
        txt_tdr.setBounds(505, 205, 100, 25);
        Env_Form.setBounds(705, 705, 140, 20);
        Preg1.setBounds(665, 10, 210, 15);
        Preg2.setBounds(695, 90, 170, 30);
        Preg4.setBounds(640, 255, 300, 15);
        Preg8.setBounds(680, 545, 220, 15);
        Preg6.setBounds(730, 390, 100, 25);
        Preg7.setBounds(695, 465, 190, 25);
        Preg3.setBounds(605, 180, 390, 20);
        Preg5.setBounds(660, 320, 225, 25);
        P1_Op1.setBounds(730, 25, 95, 25);
        P1_Op2.setBounds(730, 40, 100, 25);
        P1_Op3.setBounds(730, 55, 100, 25);
        RP1.setBounds(720, 75, 100, 25);
        RP2.setBounds(720, 160, 100, 25);
        P2_Op1.setBounds(735, 105, 35, 25);
        P2_Op2.setBounds(735, 120, 100, 25);
        P2_Op3.setBounds(735, 135, 100, 25);
        P3_Op1.setBounds(760, 185, 20, 30);
        P3_Op2.setBounds(760, 200, 100, 25);
        P3_Op3.setBounds(760, 210, 100, 25);
        RP3.setBounds(715, 230, 100, 25);
        P4_Op1.setBounds(725, 260, 100, 25);
        P4_Op2.setBounds(725, 270, 100, 25);
        P4_Op3.setBounds(725, 280, 100, 25);
        RP4.setBounds(715, 300, 100, 25);
        P5_Op1.setBounds(720, 335, 100, 25);
        P5_Op2.setBounds(720, 345, 100, 25);
        P5_Op3.setBounds(720, 355, 120, 25);
        RP5.setBounds(720, 375, 100, 25);
        P6_Op1.setBounds(755, 405, 35, 20);
        P6_Op3.setBounds(755, 425, 95, 25);
        P6_Op2.setBounds(755, 415, 100, 25);
        RP6.setBounds(720, 445, 100, 25);
        RP7.setBounds(725, 520, 100, 25);
        jcomp35.setBounds(790, -220, 100, 25);
        P7_Op2.setBounds(745, 485, 115, 25);
        P7_Op3.setBounds(745, 495, 100, 25);
        P7_Op1.setBounds(745, 475, 100, 25);
        P8_Op1.setBounds(740, 555, 100, 25);
        P8_Op2.setBounds(740, 565, 100, 25);
        P8_Op3.setBounds(740, 575, 100, 25);
        RP8.setBounds(725, 595, 100, 25);
        Preg9.setBounds(705, 610, 150, 30);
        RP9.setBounds(730, 675, 100, 25);
        P9_Op1.setBounds(750, 625, 100, 25);
        P9_Op3.setBounds(750, 655, 100, 25);
        P9_Op2.setBounds(750, 640, 100, 25);

    }

    public void actionPerformed(ActionEvent e) {
        Persona Nom = new Persona();
        Test Nom1 = new Test();

        if (e.getSource() == btn_calcularIMC) {
            String Estatura = ing_Est.getText();
            String Peso = ing_Peso.getText();

            Nom.setEstatura(Double.parseDouble(Estatura));
            Nom.setPeso(Double.parseDouble(Peso));

            Nom.calcularIMC();
            Nom.getIMC();

            RIMC = Nom.getIMC();

            if (RIMC <= 18.5) {
                txt_Ans = new JLabel("Esta bajo de peso.");
                add(txt_Ans);
                txt_Ans.setBounds(245, 385, 180, 25);
            } else if (RIMC > 18.5 && RIMC < 25) {
                txt_Ans = new JLabel("Esta en un peso adecuado.");
                add(txt_Ans);
                txt_Ans.setBounds(245, 385, 180, 25);
            } else if (RIMC >= 25 && RIMC < 30) {
                txt_Ans = new JLabel("Esta en Sobrepeso.");
                add(txt_Ans);
                txt_Ans.setBounds(245, 385, 180, 25);
            } else if (RIMC >= 30) {
                txt_Ans = new JLabel("Esta en obesidad morbida.");
                add(txt_Ans);
                txt_Ans.setBounds(245, 385, 180, 25);
            }

            res_IMC.setText(Double.toString(Nom.getIMC()));

        } else if (e.getSource() == btn_calcularTDR) {
            String P1 = ing_P1.getText();
            String P2 = ing_P2.getText();
            String P3 = ing_P3.getText();

            Nom1.setPulsacion1(Integer.parseInt(P1));
            Nom1.setPulsacion2(Integer.parseInt(P2));
            Nom1.setPulsacion3(Integer.parseInt(P3));

            Nom1.realizarTest();

            RTDR = Nom1.getTDR();

            if (RTDR <= 0) {
                txt_Ans2 = new JLabel("Es un deportista de elite.");
                add(txt_Ans2);
                txt_Ans2.setBounds(505, 385, 180, 25);
            } else if (RTDR > 0 && RTDR <= 5) {
                txt_Ans2 = new JLabel("Su estado fisico es Muy bueno.");
                add(txt_Ans2);
                txt_Ans2.setBounds(505, 385, 180, 25);
            } else if (RTDR > 5 && RTDR <= 10) {
                txt_Ans2 = new JLabel("Su estado fisico Es bueno.");
                add(txt_Ans2);
                txt_Ans2.setBounds(505, 385, 180, 25);
            } else if (RTDR > 10 && RTDR <= 15) {
                txt_Ans2 = new JLabel("Su estado fisico Es insuficiente.");
                add(txt_Ans2);
                txt_Ans2.setBounds(505, 385, 180, 25);
            } else if (RTDR > 15 && RTDR <= 20) {
                txt_Ans2 = new JLabel("Su estado fisico Es Malo.");
                add(txt_Ans2);
                txt_Ans2.setBounds(505, 385, 180, 25);
            }

            res_TDR.setText(Double.toString(Nom1.getTDR()));

        } else if (e.getSource() == Env_Form) {

            String Form_Preg1 = RP1.getText();
            String Form_Preg2 = RP2.getText();
            String Form_Preg3 = RP3.getText();
            String Form_Preg4 = RP4.getText();
            String Form_Preg5 = RP5.getText();
            String Form_Preg6 = RP6.getText();
            String Form_Preg7 = RP7.getText();
            String Form_Preg8 = RP8.getText();
            String Form_Preg9 = RP9.getText();

            if (Form_Preg1.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg1.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg1.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg2.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg2.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg2.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg3.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg3.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg3.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg4.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg4.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg4.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg5.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg5.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg5.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg6.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg6.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg6.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg7.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg7.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg7.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg8.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg8.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg8.equalsIgnoreCase("C")) {
                C++;
            }

            if (Form_Preg9.equalsIgnoreCase("A")) {
                A++;
            } else if (Form_Preg9.equalsIgnoreCase("B")) {
                B++;
            } else if (Form_Preg9.equalsIgnoreCase("C")) {
                C++;
            }

            if (A > B & A > C) {
                Consejo = new JLabel("Enhorabuena. Tu dedicación a mantener una dieta saludable es verdaderamente ");
                add(Consejo);
                Consejo.setBounds(950, 260, 455, 25);
                Consejo1 = new JLabel("inspiradora. Tus elecciones alimenticias demuestran un compromiso admirable");
                add(Consejo1);
                Consejo1.setBounds(950, 280, 455, 25);
                Consejo2 = new JLabel("con tu bienestar. Al optar por alimentos nutritivos y balanceados, estás brindando a tu cuerpo los nutrientes necesarios para funcionar de manera óptima. Continúa con tus buenos hábitos alimenticios, ya que son clave para una vida saludable y llena de vitalidad.");
                add(Consejo2);
                Consejo2.setBounds(950, 300, 460, 25);
                Consejo3 = new JLabel("a tu cuerpo los nutrientes necesarios para funcionar de manera óptima. Continúa con tus buenos hábitos alimenticios, ya que son clave para una vida saludable y llena de vitalidad.");
                add(Consejo3);
                Consejo3.setBounds(950, 320, 457, 25);
                Consejo4 = new JLabel("con tus buenos hábitos alimenticios, ya que son clave para una vida saludable.");
                add(Consejo4);
                Consejo4.setBounds(950, 340, 457, 25);
            } else if (B > A & B > C) {
                Consejo = new JLabel("Es importante tener una perspectiva moderada y consciente en cuanto a lo que ");
                add(Consejo);
                Consejo.setBounds(950, 260, 455, 25);
                Consejo1 = new JLabel("comemos, y tú lo has logrado de manera ejemplar. Al elegir una variedad de ");
                add(Consejo1);
                Consejo1.setBounds(950, 280, 455, 25);
                Consejo2 = new JLabel("alimentos y mantener una moderación en las porciones, estás contribuyendo ");
                add(Consejo2);
                Consejo2.setBounds(950, 300, 460, 25);
                Consejo3 = new JLabel("positivamente a tu salud y bienestar. Sigue adelante con tus hábitos alimenticios.");
                add(Consejo3);
                Consejo3.setBounds(950, 320, 457, 25);
                Consejo4 = new JLabel("");
                add(Consejo4);
                Consejo4.setBounds(950, 340, 457, 25);
            } else if (C > A & C > B) {
                Consejo = new JLabel("Es crucial reconocer que nuestra alimentación tiene un impacto directo en ");
                add(Consejo);
                Consejo.setBounds(950, 260, 455, 25);
                Consejo1 = new JLabel("nuestra salud y bienestar. Descuidar este aspecto puede tener consecuencias ");
                add(Consejo1);
                Consejo1.setBounds(950, 280, 455, 25);
                Consejo2 = new JLabel("significativas a largo plazo. Es fundamental priorizar nuestra salud y tomar ");
                add(Consejo2);
                Consejo2.setBounds(950, 300, 460, 25);
                Consejo3 = new JLabel("decisiones conscientes sobre lo que consumimos. No debemos subestimar el ");
                add(Consejo3);
                Consejo3.setBounds(950, 320, 457, 25);
                Consejo4 = new JLabel("poder que tienen nuestros hábitos alimenticios en nuestra calidad de vida.");
                add(Consejo4);
                Consejo4.setBounds(950, 340, 457, 25);
            } else if (A == B & A == C & B == C || A == B || A == C || B == C) {
                Consejo = new JLabel("Has hecho decisiones saludables acertadas, mientras que otras no tanto ");
                add(Consejo);
                Consejo.setBounds(950, 260, 455, 25);
                Consejo1 = new JLabel("Te recomendamos que revises muy bien lo que has hecho, para descubrir ");
                add(Consejo1);
                Consejo1.setBounds(950, 280, 455, 25);
                Consejo2 = new JLabel("que es lo que estas haciendo bien y que es lo que debes de cambiar para");
                add(Consejo2);
                Consejo2.setBounds(950, 300, 460, 25);
                Consejo3 = new JLabel("poder mejorar aun mas.");
                add(Consejo3);
                Consejo3.setBounds(950, 320, 457, 25);
                Consejo4 = new JLabel("");
                add(Consejo4);
                Consejo4.setBounds(950, 340, 457, 25);
            }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Main());
        frame.pack();
        frame.setVisible(true);
    }
}