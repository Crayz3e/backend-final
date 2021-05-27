object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        // Чтобы решить задачу есть 2 простых способа, либо посчитать количество символом от a до z, и проверить что они одинаковы для обоих строк, либо просто отсортировать обе строки, так как если они являются анаграми, то будут совпадать
        val a = s.sorted;
        val b = t.sorted;
        
        if (a.equals(b)) {
            return true;
        }
        
        return false;
    }
}ы