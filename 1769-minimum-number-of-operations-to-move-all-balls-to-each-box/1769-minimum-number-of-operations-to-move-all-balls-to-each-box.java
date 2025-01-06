class Solution {
        public int[] minOperations(String boxes) {
                int n = boxes.length();
                        int cumValue =0;
                                int cumSumValue =0;

                                        int[] answer = new int[n];
                                                //Find moves of all balls left to index i 
                                                        for(int i =0; i < n; i++){
                                                                    answer[i] = cumSumValue;

                                                                               cumValue += boxes.charAt(i) == '0' ? 0 : 1;
                                                                                           cumSumValue += cumValue;
                                                                                                   }
                                                                                                           cumValue =0;
                                                                                                                   cumSumValue =0;
                                                                                                                           //Find moves of all balls right to index i 
                                                                                                                                   for(int i =n-1; i>=0; i--){
                                                                                                                                               answer[i] += cumSumValue;

                                                                                                                                                          cumValue += boxes.charAt(i) == '0' ? 0 : 1;
                                                                                                                                                                      cumSumValue += cumValue;
                                                                                                                                                                              }
                                                                                                                                                                                      return answer;
                                                                                                                                                                                          }
                                                                                                                                                                                          
}