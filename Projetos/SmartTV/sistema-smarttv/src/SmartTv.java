public class SmartTv {
boolean ligada = false;
int canal = 5;
int volume = 20;


public void ligar (){
    ligada = true;
}

public void desligar (){
    ligada = false;
    
}

public void canalMaior (){
    canal ++;
}

public  void canalMenor (){
    canal --;
}

public void volumeMaior (){
    volume ++;
}

public void volumeMenor(){
    volume --;
}



}