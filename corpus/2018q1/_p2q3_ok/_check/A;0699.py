{
{
int vetor[],tam
int A[][]
print("Digite o tamanho do vetor: ")
tam=int(input())
for i=0 in range(0, tam):
    {
    print("Digite os elementos do vetor: ")
    criarMatriz(vetor,tam)
    imprimirMatriz(A,tam)
    print("A média é:")
    print(mediaMatriz(A,tam))
private static list[] criarMatriz(list vetor, int tam)
{
int A[][]
for i=0 in range(0, tam):
    {
    for j=0 in range(0, tam):
        {
        print("Digite os elementos da matriz: ")
    for i=0 in range(0, tam):
        {
        for j=0 in range(0, tam):
            {
            {
private static void imprimirMatriz(list[] A, int tam)
{
for i=0 in range(0, tam):
    {
    for j=0 in range(0, tam):
        {
        print(A[i][j])
        print("")
private static int mediaMatriz(list[] A, int tam)
{
int soma=0, media, elementos=0
for i=0 in range(0, tam):
    {
    for j=0 in range(0, tam):
        {
        {
        elementos ++
    media=(soma/elementos)
    return media