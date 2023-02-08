package calculator;


public class CalculatorClass {
    //Atributos de la calculadora
    float Dato1;
    float Dato2;
    //constructor que inicializa la calculadora
    public CalculatorClass(){
        Dato1 = 0;
        Dato2 = 0;
    }
    //constructor
    public CalculatorClass(float _Dato1, float _Dato2){
        Dato1 = _Dato1;
        Dato2 = _Dato2;
    }
    public float Suma(){
        return Dato1 + Dato2;
    }
    public float Resta(){
        return Dato1 - Dato2;
    }
    public float Multiplicacion(){
        return Dato1 * Dato2;
    }
    public float Division(){
        return Dato1 / Dato2;
    }
    public double sin(double a){
        double rs = a * Math.PI / 180;
        return Math.sin(rs);
    }
    public double cos(double c){
        double rs = c * Math.PI / 180;
        return Math.cos(rs);
    }
    public double Exp(){
        return Math.pow(Dato1, Dato2);
    }
    public double RaizCuad(double x){
        return Math.sqrt(x);
    }
    public int Factorial(int x){
        if (x == 0){
            return 1;
        }
        else{
            return x * Factorial(x-1);
        }
    }
    public double Iva(float i){
        return i + (i*0.19);
    }
}