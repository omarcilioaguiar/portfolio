resource "aws_instance" "backend_server" {
  ami           = "ami-0c55b159cbfafe1f0" # AMI do Ubuntu 20.04
  instance_type = "t2.micro"
  key_name      = var.key_name
  tags = {
    Name = "Backend-Server"
  }
}

resource "aws_s3_bucket" "bucket_storage" {
  bucket = "meu-bucket-terraform-123456"
}

resource "aws_db_instance" "rds_database" {
  allocated_storage = 20
  engine            = "postgres"
  engine_version    = "14"
  instance_class    = "db.t2.micro"
  username         = var.db_user
  password         = var.db_pass
  publicly_accessible = true
}
