def call(Map details){
 sh """ 
  echo "My name is ${details.name}
  echo "My age is ${details.age}
  """
}
