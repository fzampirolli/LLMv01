{
{
GeraMatriz(A, 25, 25)
ImprimeMatriz(A)
B = MatrizTransposta(A)
print("Maior valor acima da diagonal principal da matriz A: " + MaiorElemento(A))
static void GeraMatriz(int Mat[][], int L, int C)
{
for 0 in range(0, L):
    {
    for 0 in range(0, C):
        {
static void ImprimeMatriz(int matriz[][])
{
for 0 in range(0, L):
    {
    for 0 in range(0, C):
        {
        print(matriz[i][j] + "\t")
        print("\n")
static list[] MatrizTransposta(int matriz[][])
{
for 0 in range(0, L):
    {
    for 0 in range(0, C):
        {
        if i != j:
            {
    return matriz_buff
static int MaiorElemento(int matriz[][])
{
for 0 in range(0, L):
    {
    for 0 in range(0, C):
        {
        if j > i && matriz[i][j] > maior:
            {
    return maior