import java.util.ArrayList;

public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        int sum = 0;
        
        for (int i: arr){
            sum += i;
        }
        
        System.out.println(sum/(arr.length));
        

        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.

        int max = arr[0];
        
        for (int i : arr){
            if (max< i) max = i;
        }
           
        System.out.println(max);
        
        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.

        sum =0;
        
        for (int i: arr){
            if (i%2 == 0) sum+= i;
        }
        
        System.out.println(sum);


        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        ArrayList<String> fruit = new ArrayList<String>();
        
        fruit.add("apple");
        fruit.add("cucumber");
        fruit.add("grape");
        
        int count =0;
        
        for (String i: fruit){
            for (int j = 0; j <i.length(); j++){
                String letter = i.substring(j, j +1);
                if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) count++;
            }
        }
        
        System.out.println(count);
        

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        sum = 0;
        int ind =0;
        
        for (int i: arr){
            if (i%2 ==0 && ind%2 == 0){
                sum += i;
            }
            ind++;
        }
        
        System.out.println(sum);
        
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        
        for (int i=0; i < arr.length; i++){
            if (i%2 ==0 && arr[i]%2 ==0) sum+=i;
        }
        
        System.out.println(sum);
        
        //The regular loop is better becaus it has the index tracker "built in" as it reads the array based on the index of each part.
    }
}