#include <Wire.h>                 
#include <LiquidCrystal_I2C.h>  
#define Led 13
#define Puerta 4
char dataIn = "";
int val;
int pot1 =A0;
const int enPin = 11; // IN1
const int in1Pin =9; // ENABLE
const int in2Pin =10; // IN2

 
LiquidCrystal_I2C lcd(0x27, 16, 2);


void setup(){
  Serial.begin(9600);
  pinMode(Led, OUTPUT);
  pinMode(Puerta, OUTPUT);
  digitalWrite(Led, LOW);
  pinMode (pot1 , INPUT);
  pinMode (A1 , INPUT);
  pinMode (6 , OUTPUT);
  pinMode (7 , OUTPUT);
  pinMode (in1Pin , OUTPUT);
  pinMode (in2Pin , OUTPUT);
  
    }




void loop (){

  int speed = map ('5' , '0' , '9' ,0,255);
  analogWrite (enPin ,speed);

 
 


  
  if (Serial.available()) {
    dataIn = Serial.read();

     if (dataIn =='x'){
      digitalWrite(Puerta, HIGH);
        lcd.init();           //  INICIALIZA LCD
        lcd.backlight();      //  ENCIEDE
        lcd.setCursor(0, 0);  //PRIMERA FILA           
        lcd.print("BIENVENIDO");
        lcd.setCursor(0, 1);  //SEGUNDA FILA          
        lcd.print("A CASA DAVID");
      }

       if (dataIn =='y'){
      digitalWrite(Puerta, LOW);
        lcd.init();           //  INICIALIZA LCD
        lcd.backlight();      //  ENCIEDE
        lcd.setCursor(0, 0);  //PRIMERA FILA           
        lcd.print("HASTA LUEGO");
        lcd.setCursor(0, 1);  //SEGUNDA FILA          
        lcd.print("VUELVA PRONTO");
        
      }

    

    if (dataIn =='b'){
      digitalWrite (in1Pin , LOW); // APAGADO ENABLE
      }

    
    if (dataIn =='a'){
      digitalWrite (in1Pin , HIGH);//ENCENDIDO ENABLE
      digitalWrite (in2Pin , LOW);//IN2
      }

    if (dataIn =='c'){
      digitalWrite (in1Pin ,HIGH);//ENCENDIDO ENABLE
      digitalWrite (enPin , LOW);
      digitalWrite (in2Pin , HIGH);//IN1
      }

     

    

    if (dataIn == '1') {
      digitalWrite(Led, HIGH);
    }

    if (dataIn == '0') {
      digitalWrite(Led,LOW);
      }
      
      
      }
    
  
  val = analogRead (A1);
  float mv = (val/1024.0)*5000;
  float temp = mv/10;

  Serial.print ("TEMPERATURA = ");
  Serial.print (temp);
  Serial.print (" *C");
  Serial.println ();

  if (temp >20){
    digitalWrite (7, HIGH);
    digitalWrite(6, HIGH);
    }
  else {
    digitalWrite(6, HIGH);   // turn the LED on (HIGH is the voltage level)
   delay(500);                       // wait for a second
    digitalWrite(6, LOW);    // turn the LED off by making the voltage LOW
    delay(500);  
    digitalWrite (7, LOW);
    }

  delay (500);
  
  
}
