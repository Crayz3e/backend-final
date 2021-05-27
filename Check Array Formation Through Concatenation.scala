object Solution {
    def canFormArray(arr: Array[Int], pieces: Array[Array[Int]]): Boolean = {
        // Для решения данной задачи достаточно проверить чтобы все отрезки(pieces[i]) находились в основном массиве в том же порядке, если он не находится то возвращаем false.
        for (i <- 0 until pieces.length) {
            var k = 0;
            var j = 0;
            // Здесь дефолтный чекер, мы проходимся по основному массиву и смотрим совпадения с 1 элементом массива pieces[i][0], если они совпадают то дальше сверяем с pieces[i][1] и т д иначе проверяем с самого начала
            while (j < arr.length && k != pieces(i).length) {
                if (arr(j) == pieces(i)(k)) k += 1;
                else k = 0;
                
                j += 1;
            }
            
            if (k != pieces(i).length) return false;
       }
        
        return true;
    }
}