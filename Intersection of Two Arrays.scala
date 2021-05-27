object Solution {
    def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        // Чтобы проверить на их персечение, можно избавиться от дупликатов в массивах, и затем посмотреть пересечение, то есть нужно проверить есть ли элемент из одного массива в другом массиве. Set помогает избавиться от дупликатов и за O(logn) находить элемент в другом массиве.
        var arr1 = scala.collection.mutable.Set[Int]()
        
        for (num <- nums1) {
            arr1 += num
        }
        
        var ans = Array[Int]()
        var arr2 = nums2.toSet;
        for (num <- arr2) {
            if (arr1.contains(num)) {
                ans :+= num
            }
        }
        
        ans
    }
}