public int liczbinarnie(String s) {
        long value = Integer.parseInt(s,2);
        int count = 0;
        int countMax = 0;
        int factor = value < 0 ? -1 : 1;
        if(s.charAt(s.length()-1)=='0'){
            int i = s.length()-1;
            while (s.charAt(i)=='0'){
                value/=2;
                i--;
            }
        }

        while((value * factor) > 0)
        {
            count = value % 2 == 0 ? count + 1 : 0;
            value /= 2;
            countMax = Math.max(count, countMax);
        }
        return  countMax;
    }
