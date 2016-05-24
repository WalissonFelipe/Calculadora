package com.example.mint.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private String pegaVisor;
    private TextView Visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Visor = (TextView)findViewById(R.id.txtVisor);

    }

    // Metodos para os numeros

    public void Nove(View view){

        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "9");
    }

    public void Oito(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "8");
    }

    public void Sete(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "7");
    }

    public void Seis(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "6");
    }

    public void Cinco(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "5");
    }

    public void Quatro(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "4");
    }

    public void Tres(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "3");
    }

    public void Dois(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "2");
    }

    public void Um(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "1");
    }

    public void Zero(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + "0");
    }

     // Metodos para Operaçoes
     // Somar Dividir Subtrair Multiplicar

    public void Somar(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + " + ");
        //Toast.makeText(MainActivity.this, "Funcionalidade Indisponivel", Toast.LENGTH_SHORT).show();
    }

    public void Subtrair(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + " - ");
        //Toast.makeText(MainActivity.this, "Funcionalidade Indisponivel", Toast.LENGTH_SHORT).show();
    }

    public void Dividir(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + " / ");
        //Toast.makeText(MainActivity.this, "Funcionalidade Indisponivel", Toast.LENGTH_SHORT).show();
    }

    public void Multiplicar(View view){
        pegaVisor = Visor.getText().toString();
        this.Visor.setText(pegaVisor + " * ");
        // Toast.makeText(MainActivity.this, "Funcionalidade Indisponivel", Toast.LENGTH_SHORT).show();
    }

    // Metodos para o Botao CE
    public void CE(View view) {
        this.Visor.setText("");
        Toast.makeText(MainActivity.this, "Limpando...", Toast.LENGTH_SHORT).show();
    }

    public void Igual(View veiw){
       pegaVisor = Visor.getText().toString();

        try {

        Expression e = new ExpressionBuilder(pegaVisor).build();
        double result   = e.evaluate();
        String exibirResultado = String.valueOf(result);
        this.Visor.setText(exibirResultado);
        }

        catch (Exception ex){
            AlertDialog ad = new AlertDialog.Builder(this).create();
            ad.setTitle("Erro");
            ad.setMessage("Operação invalida");
            ad.show();
        }
    }

}
