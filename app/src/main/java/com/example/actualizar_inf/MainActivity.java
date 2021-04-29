package com.example.actualizar_inf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
boolean estadoBoton;
 Button boton;
TextView cajadetexto;
ImageView ver_imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estadoBoton=true;
        boton=findViewById(R.id.Button);
cajadetexto= findViewById(R.id.textView);
ver_imagen=findViewById(R.id.imageView);
    }

    //Metodos
    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                     //   if (estadoBoton==true){
ver_imagen.setImageResource(R.drawable.image);

                            boton.setText("s");

                            cajadetexto.setText("1. Segurança em primeiro lugar\n" +
                                    "A operação de moldes de injeção envolve a utilização de " +
                                    "equipamentos capazes de suportar altas pressões, temperaturas e altas velocidades." +
                                    " Todos os operadores devem estar cientes das medidas de segurança e colocá-las em prática.\n" +
                                    "Como medidas de proteção pessoal, os operadores devem usar roupas e óculos de proteção nas áreas onde o plástico " +
                                    "derretido é processado, como nos bicos do molde, no bocal da máquina ou na zona de alimentação da máquina. " +
                                    "Devem utilizar dispositivos de fechamento e sinalização das fontes de alimentação, de acordo com as regulamentações " +
                                    "locais. Se isso não puder ser feito durante a detecção de uma falha elétrica, recomenda-se a instalação de um sinal" +
                                    " de perigo que seja claramente visível para os outros.");
                            estadoBoton= false;

                     // else{
                       //         boton.setText("Adios");
                          //      cajadetexto.setText("Adios");
                            //    estadoBoton= false;
                           // }

                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    //if (estadoBoton==true){
                    boton.setText("2. Montagem segura de moldes\\n\" +\n" +
                            "                            \"Os parafusos e grampos de montagem podem se soltar durante o ciclo de moldagem e, \" +\n" +
                            "                            \"portanto, devem ser verificados e apertados regularmente para substituir quaisquer parafusos gastos ou \" +\n" +
                            "                            \"danificados e verificar a condição do flange de montagem do molde quanto a quaisquer \" +\n" +
                            "                            \"sinais de danos, desgaste ou envelhecimento. Não fazer isso pode resultar em ferimentos graves ou acidentes. \" +\n" +
                            "                            \"Para equipamentos de troca rápida de molde, consulte as recomendações do fabricante original para manutenção.\\n\" +\n" +
                            "                            \"Os moldes ou máquinas que não foram nivelados corretamente estão sujeitos a cargas irregulares e consequente\" +\n" +
                            "                            \" desgaste acelerado. \" +\n" +
                            "                            \"A utilização de um nível eletrônico para verificar o nivelamento da máquina e posteriormente do molde\" +\n" +
                            "                            \" é uma etapa muito importante na redução do desgaste do equipamento. Este aspecto deve ser verificado regularmente.");
                    cajadetexto.setText("2. Montagem segura de moldes\n" +
                            "Os parafusos e grampos de montagem podem se soltar durante o ciclo de moldagem e, " +
                            "portanto, devem ser verificados e apertados regularmente para substituir quaisquer parafusos gastos ou " +
                            "danificados e verificar a condição do flange de montagem do molde quanto a quaisquer " +
                            "sinais de danos, desgaste ou envelhecimento. Não fazer isso pode resultar em ferimentos graves ou acidentes. " +
                            "Para equipamentos de troca rápida de molde, consulte as recomendações do fabricante original para manutenção.\n" +
                            "Os moldes ou máquinas que não foram nivelados corretamente estão sujeitos a cargas irregulares e consequente" +
                            " desgaste acelerado. " +
                            "A utilização de um nível eletrônico para verificar o nivelamento da máquina e posteriormente do molde" +
                            " é uma etapa muito importante na redução do desgaste do equipamento. Este aspecto deve ser verificado regularmente.");
                    estadoBoton= false;
                  //  }else{

                    //    boton.setText("Hola");
                      //  cajadetexto.setText("Hola");
                        //estadoBoton= false;
                    }

                return true;
            case KeyEvent.KEYCODE_ENTER:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    if (estadoBoton==true)
                        boton.setText("3. Requisitos de limpeza do molde e da máquina\\n\" +\n" +
                                "                                \"Limpe cuidadosamente as superfícies de vedação, tampas, orifícios de ventilação e superfícies de separação, \" +\n" +
                                "                                \"usando produtos de limpeza e ferramentas adequados. \" +\n" +
                                "                                \"Por exemplo, um sistema de limpeza industrial do tipo \\\"gelo seco\\\", como o Power DFX da Husky, \" +\n" +
                                "                                \"pode ser muito vantajoso para acelerar o processo e a profundidade da limpeza, ao mesmo tempo, evitando o uso\" +\n" +
                                "                                \" de solventes agressivos. Caso o usuário não possua este tipo de sistema de limpeza baseado na projeção de partículas \" +\n" +
                                "                                \"de gelo seco, recomenda-se o uso de panos de limpeza macios e não abrasivos, a fim de reduzir as chances de danos ou \" +\n" +
                                "                                \"arredondamento de arestas vivas. Objetos como escovas de náilon ou ferramentas de madeira podem ser usados. \" +\n" +
                                "                                \"A contaminação severa pode exigir a desmontagem completa e todos os tipos de detritos presentes no processo de limpeza\" +\n" +
                                "                                \" deverão ser removidos da face do molde. Os solventes de limpeza devem ser usados \\u200B\\u200Bcom moderação para \" +\n" +
                                "                                \"evitar a remoção do lubrificante de áreas de difícil acesso.");
                        cajadetexto.setText("3. Requisitos de limpeza do molde e da máquina\n" +
                                "Limpe cuidadosamente as superfícies de vedação, tampas, orifícios de ventilação e superfícies de separação, " +
                                "usando produtos de limpeza e ferramentas adequados. " +
                                "Por exemplo, um sistema de limpeza industrial do tipo \"gelo seco\", como o Power DFX da Husky, " +
                                "pode ser muito vantajoso para acelerar o processo e a profundidade da limpeza, ao mesmo tempo, evitando o uso" +
                                " de solventes agressivos. Caso o usuário não possua este tipo de sistema de limpeza baseado na projeção de partículas " +
                                "de gelo seco, recomenda-se o uso de panos de limpeza macios e não abrasivos, a fim de reduzir as chances de danos ou " +
                                "arredondamento de arestas vivas. Objetos como escovas de náilon ou ferramentas de madeira podem ser usados. " +
                                "A contaminação severa pode exigir a desmontagem completa e todos os tipos de detritos presentes no processo de limpeza" +
                                " deverão ser removidos da face do molde. Os solventes de limpeza devem ser usados \u200B\u200Bcom moderação para " +
                                "evitar a remoção do lubrificante de áreas de difícil acesso.");
                        estadoBoton= false;

                }
            default:
                return super.dispatchKeyEvent(event);
        }
    }




/*
public void pulsarboton(){
if (estadoBoton==true){


boton.setText("Hola");
cajadetexto.setText("Hola");
estadoBoton= false;



}else{
    boton.setText("Adios");
cajadetexto.setText("Adios");
estadoBoton= false;
}
*/

//}

}