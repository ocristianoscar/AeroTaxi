package com.company.App;

import com.company.Model.Bronze;
import com.company.Model.Gold;
import com.company.Model.Propulsion;
import com.company.Model.Silver;

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
        Bronze bronce1 = new Bronze(9500,150,10,1050,Propulsion.REACCION,false);//Dassault Falcon 900LX
        Bronze bronce2 = new Bronze(9500,150,10,1050,Propulsion.REACCION,false);
        Bronze bronce3 = new Bronze(7500,175,19,1050,Propulsion.REACCION,false);//Dassault Falcon 2000LX
        Bronze bronce4 = new Bronze(7500,175,19,1050,Propulsion.REACCION,false);

        Silver silver1 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);//Gulfstream 650ER
        Silver silver2 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);
        Silver silver3 = new Silver(20000,250,10,1110,Propulsion.HELICE,false);

        Gold gold1 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);//Cessna Citation X+
        Gold gold2 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);
        Gold gold3 = new Gold(6000,300,12,1150, Propulsion.REACCION,true,false);
=======
        // los jets privados son de tener 6.000 litros para una capacidad de pasajeros de 12. Los mas populares llegan a 1.100 km x hora.
        Bronze bronce1 = new Bronze(3000,150,10,6000,Propulsion.HELICE,false);
        Bronze bronce2 = new Bronze(3000,150,10,6000,Propulsion.HELICE,false);
        Bronze bronce3 = new Bronze(3000,150,10,6000,Propulsion.HELICE,false);

        Silver silver1 = new Silver(4500,250,15,9000,Propulsion.HELICE,false);
        Silver silver2 = new Silver(4500,250,15,9000,Propulsion.HELICE,false);
        Silver silver3 = new Silver(4500,250,15,9000,Propulsion.HELICE,false);

        Gold gold1 = new Gold(6000,300,18,1100, Propulsion.HELICE,true,false);
        Gold gold2 = new Gold(6000,300,18,1100, Propulsion.HELICE,true,false);
        Gold gold3 = new Gold(6000,300,18,1100, Propulsion.HELICE,true,false);
>>>>>>> Cristian


    }
}
