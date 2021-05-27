object Solution {
    def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
        // Арифмитическая прогрессия означает что он либо убывает, либо возрастает так как мы имеет константу d, в выражении a[i] = a[i - 1] + d; то есть чтобы проверить нам всегда нужно отсортировать массив и проверить разности соседних элементов.
        val a = arr.sorted;
        val diff = a(1) - a(0);
        for (i <- 1 until arr.length) {
            if (a(i) - a(i - 1) != diff) return false;
        }
        
        return true;
    }
}