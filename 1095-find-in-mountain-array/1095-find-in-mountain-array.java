class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);

        // search in ascending part
        int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // search in descending part
        return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    // find peak index
    public int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // order agnostic binary search
    int orderAgnosticBinarySearch(MountainArray arr, int target, int start, int end) {

        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}