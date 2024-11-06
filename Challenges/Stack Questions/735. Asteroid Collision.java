class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> a=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
           if(a.isEmpty())
               a.push(asteroids[i]);
           else if(a.peek()<0){
               a.push(asteroids[i]);
           }
           else{
               if(asteroids[i]>0)
                   a.push(asteroids[i]);
               else{
                   while(!a.isEmpty()){
                        if(a.peek()<0)
                            break;
                       if(a.peek()>Math.abs(asteroids[i])) {
                           asteroids[i]=0;
                           break;
                       }
                       else if(a.peek()==Math.abs(asteroids[i]) ){
                           asteroids[i]=0;
                           a.pop();
                           break;
                       }
                       else
                           a.pop();
                   }
                   if(asteroids[i]!=0)
                       a.push(asteroids[i]);
               }
           }
        }
        int []stateOfAestroids=new int[a.size()];
        for(int i=0;i<a.size();i++)
            stateOfAestroids[i]=a.get(i);
        return stateOfAestroids;
    }
}
