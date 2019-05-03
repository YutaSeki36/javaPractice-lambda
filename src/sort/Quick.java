package sort;

/**
 * クイックソートを自力で実装してみる
 * 参考サイト: https://qiita.com/gigegige/items/4817c27314a2393eb02d
 */
public class Quick {

    public static void main(String[] args){
        int[] d = {1, 4, 60, 45, 42, 70, 2 , 3, 21, 65, 89, 88, 99, 100, 67};

        quickSort(d, 0, d.length-1);

        // 結果表示
        System.out.print("結果:");
        for(int ds: d){
            System.out.print(ds + ",");
        }
        System.out.println();
    }

    static void quickSort(int[] d, int left, int right){

        /*
        * ベースケース
        * 左初期値が右端初期値と同じかそれ以上なら処理終了
        * */
        if(left >= right) return;

        /*
        * pivot
        * 与えられた配列の中心を取る．
        * */
        int pivot = (left + right) / 2;

        int l = left, r = right;

        /*
         *　ソートを行う処理
         *  lがrと同値，即ちlとrが中心まで処理を終えた時にループ終了
         */
        while (l<=r){

            // 中心の値と左側の値を比較し，中心値より大きければそこでストップ
            while (d[l] < d[pivot]){ l++; }

            // 右側の値と中心を比較し，中心値より小さければそこでストップ
            while (d[pivot] < d[r]){ r--; }

            // まだ中心にたどり着いていない時に処理
            if(l <= r){

                // swap処理
                int tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;

                // swap処理が終わったらlとrの位置を進める
                l++; r--;
            }
        }

        // 右側のソート
        quickSort(d, left, r);

        // 左側のソート
        quickSort(d, l, right);
    }
}
