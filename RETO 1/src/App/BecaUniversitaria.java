package App;
public class BecaUniversitaria {
    double pMonto =0;
    int pTiempo =0;
    double pInteres =0;
    double CaInSP =0;
    double CaInCM =0;
    double COMP =0;
    public BecaUniversitaria(){
        pMonto = 0;
        pTiempo = 0;
        pInteres = 0;
    }
    

public BecaUniversitaria(int _pTiempo , double _pMonto , double _pInteres ){
    pMonto = _pMonto;
    pTiempo = _pTiempo;
    pInteres = _pInteres;
}


public double calcularInteresSimple ( ){
    CaInSP = pMonto * (pInteres/100)*pTiempo;
    return CaInSP;
}

    public double calcularInteresCompuesto ( ){
        CaInCM = Math.round (pMonto * (Math.pow((1+(pInteres/100)), pTiempo)-1));
        return CaInCM;
        
    }
    
    public  String compararInversion (int pTiempo , double pMonto , double pInteres ){
        COMP= Math.round((pMonto * (Math.pow((1+(pInteres/100)), pTiempo)-1))-(pMonto * (pInteres/100)*pTiempo));
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + COMP;
    

    }
    
    public  String compararInversion ( ){
        if(pInteres==0 && pMonto==0 && pTiempo==0){
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            COMP= Math.round((pMonto * (Math.pow((1+(pInteres/100)), pTiempo)-1))-(pMonto * (pInteres/100)*pTiempo));
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + COMP;
        }
    }
    
}
