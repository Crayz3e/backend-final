object Solution {
    def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
        // Задачу можно решить жадно, нужно брать коробки с максимальным количеством припасов пока это возможно
        // Сортируем массив по 2 элементу(оно показывает кол-во припасов) и переворачиваем(чтобы начинались с максимального)
        val a = boxTypes.sortBy(_(1)).reverse;
        
        var ans = 0;
        var cnt = 0;
        for (i <- 0 until a.length) {
            // если можем взять всё - берём всё, иначе - берём то что сможем взять.
            if (truckSize - cnt >= a(i)(0)) {
                cnt += a(i)(0);
                ans += a(i)(0) * (a(i)(1));
            } else {
                var iCanTake = truckSize - cnt;
                cnt += iCanTake;
                ans += iCanTake * (a(i)(1));
            }
            
            print(cnt, ans);
        }
        
        ans
    }
}