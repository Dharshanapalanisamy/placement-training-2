def linear_search(arr, key):
    for i, val in enumerate(arr):
        if val == key:
            return i
    return -1

arr = [4, 8, 15, 23, 42]
key = 15
print(f"Element found at index: {linear_search(arr, key)}")
