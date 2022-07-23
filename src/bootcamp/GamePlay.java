package bootcamp;

import java.util.Scanner;

public class GamePlay {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        int number,id;
        //System.out.println("Digite o número de gameplays publicadas");
        number=sc.nextInt();
        //System.out.println("Digite o seu identificador na universidade");
        id=sc.nextInt();

        int count=0;
        while(number>0){

            int id1,num;

            //System.out.println("Digite o identificador do player");
            id1=sc.nextInt();
            //System.out.println("Digite o numero referente ao game: 0 - CS 1 - LOL");
            num=sc.nextInt();

            if(id== id1 &&  num==0){
                count++;
            }

            number--;
        }
        System.out.println(count);
sc.close();
    }


	}


