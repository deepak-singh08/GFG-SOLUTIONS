class Solution {
    public int search(int arr[], int x) {
        // code here
       // for (int i = 0; i< arr.length; i++){
         //   if (arr[i] == key){
           //     system.out.println("Element found at index " + i);
             //   found = true;
               // break;
        //    }
          //  if (!found){
            //    system.out.println("Element not found");
            //}
        //    }
    //    }
    //}
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }
    }

