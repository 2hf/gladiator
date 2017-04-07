### Description

Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have ***exactly*** one solution, and you may not use the same element twice.

**Example:**

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

### Solutions

#### Approach #1 Brute Force

双重循环，判断数组元素求和是否与target相等，返回数组元素index。

时间复杂度O(n^2)，空间复杂度O(1)。

#### Approach #2 One-pass Hash Table

使用哈希表，Key为数组元素值，Value为元素index。遍历一次数组，判断哈希表中是否有目标元素（target-nums[i]），如果有，记录当前的索引；如果没有，将元素放入哈希表，继续遍历。
```java
public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<>();
	int a = 0;
	int b = 0;
	for(int i=0; i<nums.length; i++){
		int c = target - nums[i];
		if(map.containsKey(c)){
			a = map.get(c);
			b = i;
			break;
		}
		map.put(nums[i], i);
	}
	return new int[]{a, b};
}
```
