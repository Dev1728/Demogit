
function nearestPerfectSquareDifference( n) {
        let lowerPS = 0;
        let higherPS = 0;

        
        for (let i = 0; i * i <= n; i++) {
            lowerPS = i * i;
        }

     
        for (let i = 0; i * i <= n; i++) {
            higherPS = (i + 1) * (i + 1);
        }

      
        let diff1 = n - lowerPS;
        let diff2 = higherPS - n;

      
        return Math.min(diff1, diff2);
    }

let num=38;
console.log(nearestPerfectSquareDifference(num));
// public class perfectsq {
//     public static int perfectsquare(int n){
//         int temp1=0;
//         for(int i=0;i<=n;i++){
//             if(i*i<=n){
//                 temp1=i*i;
//             }
//         }
//         int temp2=0;
//         for(int i=0;i<=n;i++){
//             if(i*i>=n){
//                 temp2=i*i;
//                 break;
//             }
//         }
//        int diff1=n-temp1;
//        int diff2=temp2-n;

//         return Math.min(diff1,diff2);
//     }
//     public static void main(String[] args) {
//         int i=25;
//         System.out.println(perfectsquare(i));
//     }
// }
    

