# ☁ Infraestrutura AWS com Terraform

Este projeto cria infraestrutura AWS usando **Terraform**, incluindo **EC2**, **RDS (PostgreSQL)** e **S3**.

## 🚀 Tecnologias Utilizadas:
- Terraform
- AWS EC2, RDS (PostgreSQL), S3

## 📌 Como Rodar?
1️⃣ **Configurar credenciais AWS**
```sh
export AWS_ACCESS_KEY_ID="sua-chave"
export AWS_SECRET_ACCESS_KEY="sua-chave-secreta"

```
2️⃣ **Inicializar Terraform**
````sh
terraform init

`````
3️⃣ **Validar e aplicar a infraestrutura**
```sh
terraform apply -auto-approve

````
4️⃣ **Obter os valores gerados**
```sh
terraform output
````