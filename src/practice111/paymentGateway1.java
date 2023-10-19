package javaproject;
public abstract class paymentGateway1 {

           public static void main(String[] args) {

            creditCard creditCard = new creditCard();

            creditCard.authorize();

            creditCard.credit();

            creditCard.debit();

    

            digitalWallet digiObj = new digitalWallet();
              


            

        }

            

         //  1. Create an abstract class named PaymentGateway.

          //  2. Define abstract methods like authorize(), debit(), and credit().

         //   3. Create concrete classes like CreditCard, DigitalWallet, and BankTransfer extending PaymentGateway.

         //   4. Implement the abstract methods in each concrete class with their specific logics.

         //   5. In the main method, instantiate different payment methods and process a payment through each one.*//

           

             

            

           

            

            

            public abstract void authorize();

            

             public  abstract void debit();

            public  abstract void  credit();

        }

         
class creditCard extends  paymentGateway1{
             public void authorize()

             {

                 System.out.println(" it is authorize");

             }

             public void debit()

             {

                 System.out.println(" debit ");

             }

             public void credit()

             {

                 System.out.println("  credit");

 
             }
 

        }

             

class  digitalWallet extends paymentGateway1{

       

     public void authorize() {

         System.out.println(" wallet");

     }

     

     public void  debit() {

         System.out.println(" debit wallet");

     }

     public void credit() {

         System.out.println(" wallet credit");

     }

}

 

       

 