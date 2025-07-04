import re
def check_password_strength(password):
    if len(password) < 8:
        return "Weak (Too short)"
    if not re.search(r"[A-Z]", password):
        return "Weak (No uppercase)"
    if not re.search(r"[a-z]", password):
        return "Weak (No lowercase)"
    if not re.search(r"[0-9]", password):
        return "Weak (No digit)"
    if not re.search(r"[\W_]", password):
        return "Weak (No special char)"
    return "Strong"



