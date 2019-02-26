package FacebookInterviewkit;

import java.util.LinkedList;

public class TwoNumderAdditionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();

        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l2.add(3);
        l2.add(9);
        l2.add(2);

        int maxlen, minlen;

        if(l1.size() <= l2.size())
        {
            maxlen = l1.size();
            minlen = l2.size();
        }

        else
        {
            maxlen = l2.size();
            minlen = l1.size();
        }

        int carry = 0;
        for(int i = maxlen-1; i>=0; i--)
        {
            int tmp1 = l1.get(i);
            int tmp2 = l2.get(i);
            int tmp3 = tmp1 + tmp2 + carry;
            carry = 0;

            if(tmp3 >= 10)
            {
                carry = (tmp3/10)%10;
                tmp3 = tmp3%10;
            }

            res.addFirst(tmp3);
        }

        if(l1.size() > l2.size())
        {
            for(int i =maxlen; i< minlen;i++)
            {
                int tmp1 = l1.get(i);
                int tmp2 = tmp1 +carry;
                carry = 0;

                if(tmp2 >= 10)
                {
                    carry = (tmp2/10)%10;
                    tmp2 = tmp2%10;
                }
                res.addFirst(tmp2);
            }

            if(carry !=0)
                res.addFirst(carry);
        }
        else if (l1.size() < l2.size())
        {
            for(int i =maxlen; i< minlen;i++)
            {
                int tmp1 = l2.get(i);
                int tmp2 = tmp1 +carry;
                carry = 0;

                if(tmp2 >= 10)
                {
                    carry = (tmp2/10)%10;
                    tmp2 = tmp2%10;
                }
                res.addFirst(tmp2);
            }

            if(carry !=0)
                res.addFirst(carry);
        }
        else if((l1.size() == l1.size()) && (carry !=0))
        {
            res.addFirst(carry);
        }

        System.out.println("Result" +res);
    }
}
