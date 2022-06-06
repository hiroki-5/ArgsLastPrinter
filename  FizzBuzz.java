public class  FizzBuzz {

    /*コマンドライン引数を受け取る*/
     public static void main(String[] args) {
        /*1.で受け取った引数を数値に変換する*/
		if (args.length == 0) {
			/*2.で変換した数値の回数分、繰り返し処理を行う*/
            return;
		}
       /* 1. 表示用の文字列を保持する変数 `result` を定義する*/
		int max = Integer.parseInt(args[0]);
		String result = null;
    
        /*3.の繰り返し処理の中で、「何回目の処理か？」を表示する*/
		for (int i = 0; i < max; i++) {
			int num = i + 1;
			result = "";
            /*2. 表示しようとしている数字が3で割り切れるか？を確認する
            - 割り切れるときだけ、変数 `result` に、文字列 `Fizz` を追加する*/
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
           /* 3. 表示しようとしている数字が5で割り切れるか？を確認する
     - 割り切れるときだけ、変数 `result` に、文字列 `Buzz` を追加する*/
			if (num % ① == 0) {
				② = result + "③";
			}
            /*4. 変数 `result` の文字数が `空文字※` かどうか？を確認する
            - 空文字だったときだけ、変数 `result` に数字を文字列として加える*/
			if (result.length() == 0) {
				result = result + num;
			}
            /*5. 変数 `result` を表示する*/
			System.out.print(result + " ");
		}
	}
}

} 

 
 
 

 

 


 