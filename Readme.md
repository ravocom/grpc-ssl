1. Idea> Gradle>Java project

2. Search for grpc-java and get below dependencides

   a) gRPC dependencies
       compile 'io.grpc:grpc-netty-shaded:1.18.0'  
       compile 'io.grpc:grpc-protobuf:1.18.0'  
       compile 'io.grpc:grpc-stub:1.18.0'  
       
   b) Include protobuf based codegen integrate with gradle  
   
   apply plugin: 'com.google.protobuf'
   
   buildscript {
     repositories {
       mavenCentral()
     }
     dependencies {
       classpath 'com.google.protobuf:protobuf-gradle-plugin:0.8.5'
     }
   }
   
   protobuf {
     protoc {
       artifact = "com.google.protobuf:protoc:3.5.1-1"
     }
     plugins {
       grpc {
         artifact = 'io.grpc:protoc-gen-grpc-java:1.18.0'
       }
     }
     generateProtoTasks {
       all()*.plugins {
         grpc {}
       }
     }
   }  
   
   c) include idea plugin  
   apply plugin: 'idea'  
   (and enable auto import for gradle)
   
3.  Write the proto file and generate the code by gradle>tasks>other>generateProto
     src>main>proto>availability.proto 
     
     syntax = "proto3";
     
     package proto;
     
     option java_package="com.rimaz.availability";
     option java_multiple_files= true;
     
     message AvailabilityRequest{
         int32 flight_id=1;
     }
     
     message AvailabilityResponse{
         int32 seats = 1;
     }
     
     service AvailabilityService{
         rpc Availability(AvailabilityRequest) returns (AvailabilityResponse) {}
     }
 
 4.  Write the server
 
 5. Write the serviceImpl by extending ServiceImplBase
 
 6. Write the client.
 
 *) Enable for SSL  
    a) Generate the required cert files.  
       Google search grpc-java > examples>example-tls
    b) Server related impl  
        .useTransportSecurity(new File("ssl/server.crt"), new File("ssl/server.pem"))
    c) Client related impl  
          .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
          refer: https://grpc.io/docs/guides/auth.html