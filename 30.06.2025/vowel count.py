def count_vowel_words(sentence):
    vowels = 'aeiouAEIOU'
    words = sentence.split()
    return len([w for w in words if w[0] in vowels])

text = input("Enter a sentence: ")
print("Words starting with vowel:", count_vowel_words(text))
