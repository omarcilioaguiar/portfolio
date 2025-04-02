output "ec2_public_ip" {
  value = aws_instance.backend_server.public_ip
}

output "s3_bucket_name" {
  value = aws_s3_bucket.bucket_storage.id
}

output "rds_endpoint" {
  value = aws_db_instance.rds_database.endpoint
}
