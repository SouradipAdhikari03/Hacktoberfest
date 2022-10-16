public class Q14_MajorityHalf {
    public static void main(String[] args) {
        int a[]={1,1,1,1,2,3,4};
        Q14_MajorityHalf t=new Q14_MajorityHalf();
              int x=t.majorityElement(a);
        System.out.println(x);
    }
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate)
                count += 1;
            else count -= 1;
        }

        return candidate;
    }
}
