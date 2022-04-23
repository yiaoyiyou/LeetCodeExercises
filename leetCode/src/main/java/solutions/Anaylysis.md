# 思路分析
## 复杂度分析
### 数据规模问题
## 数组问题
### 快排应用
#### 常规partion
283 26 80 27 75 几题，均为快排一次partion的应用。
此种问题，具有以下共同特征：
1. 可以进行顺序遍历。如26 80是顺序，283 27 是找是否相等，也可顺序遍历。
2. 均能将数组，分成两部分，即[0, i]、[i + 1, j)
据此，这种问题可以可以通过一次partion操作完成。
另外，根据[i + 1, j)区间是否需要维护，有可以分为赋值、交换。
#### 三路快排
稍有不同的是，75号题目，只有三种元素，就可以通过赋值避免交换.

**75题，用常规三路快排时，交换数据，需要当心，有坑，不能直接进行赋值0 1的，不然开始的边界条件不能满足**
如下：
```
        while (index < nums.length && index < r) {
            if (nums[index] == 0) {
                l++;
                nums[l] = 0;
                //错误，会把原本的值冲掉
                nums[index] = 1;
                index ++;
            } else if (nums[index] == 2) {
                r--;
                nums[index] = nums[r];
                nums[r] = 2;
            } else {
                index ++;
            }
        }
        
       while (index < nums.length && index < r) {
            if (nums[index] == 0) {
                int swap = nums[l + 1];
                nums[l + 1] = nums[index];
                nums[index] = swap;
                l ++;
                index ++;
            } else if (nums[index] == 2) {
                r--;
                nums[index] = nums[r];
                nums[r] = 2;
            } else {
                index ++;
            }
        }
```

#### 三路快排找第N大
215题，一气呵成，成就感。



### 计数排序应用
75题，可以使用计数排序

### 归并排序应用
88号题，典型的归并排序应用。需要变通的点，就是先排大。而不是常规的先排小。

