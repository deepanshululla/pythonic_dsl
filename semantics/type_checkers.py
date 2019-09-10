
class TypeChecker:
    @classmethod
    def is_integer(cls, value:str):
        if value.startswith('-'):
            return value[1:].isdigit()
        else:
            return value.isdigit()

    @classmethod
    def is_double(cls, value:str):
        try:
            float(value)
            return True
        except ValueError:
            return False
