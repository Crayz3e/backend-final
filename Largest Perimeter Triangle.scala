object Solution {
    def largestPerimeter(nums: Array[Int]): Int = {
        // Сортируем массив и пробегаемся по тройкам, обновляя ответ, т.к массив отсортирован то новый ответ всегда будет оптимальным.
        val a = nums.sorted;
        var ans = 0;
        for (i <- 0 until a.length - 2) {
            if (a(i) + a(i + 1) > a(i + 2) && a(i) + a(i + 2) > a(i + 1) && a(i + 1) + a(i + 2) > a(i)) ans = a(i) + a(i + 1) + a(i + 2);
        }
        
        ans
    }
}