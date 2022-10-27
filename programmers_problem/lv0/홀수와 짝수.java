class Solution {
    public int[] solution(int[] num_list) {
        int odd_answer = 0;
        int even_answer = 0;

        for (int loop = 0; loop < num_list.length; loop++) {
            if (num_list[loop] % 2 != 0)
                odd_answer++;
            else
                even_answer++;
        }

        return new int[] {even_answer, odd_answer};
    }
}
