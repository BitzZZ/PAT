import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		int thissum=0, maxsum = 0, itir, s, n, fs = 0, fe = 0,flag =0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		String sult0 = new String();
		int[] sult = new int[n];
		sult0 = in.nextLine();
		String[] sult1 = sult0.split(" ");
		for(itir = 0,s = 0; itir< n; itir++){
			sult[itir] = Integer.parseInt(sult1[itir]);
			if(sult[itir]>=0) flag =1;
			if(thissum == 0){
				s=sult[itir];
			}
			thissum += sult[itir];
			if(thissum>maxsum){
				maxsum = thissum;
				fs = s;
				fe = sult[itir];
			}
			if(thissum<0){
				thissum = 0;
			}
		}if(flag==0){
			maxsum=0;
			fs=sult[0];
			fe=sult[n-1];
		}
		System.out.println(maxsum+" "+fs+" "+fe);
	}

}
