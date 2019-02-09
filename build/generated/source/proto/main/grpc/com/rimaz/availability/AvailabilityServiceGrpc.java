package com.rimaz.availability;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: availability.proto")
public final class AvailabilityServiceGrpc {

  private AvailabilityServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.AvailabilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rimaz.availability.AvailabilityRequest,
      com.rimaz.availability.AvailabilityResponse> getAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Availability",
      requestType = com.rimaz.availability.AvailabilityRequest.class,
      responseType = com.rimaz.availability.AvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rimaz.availability.AvailabilityRequest,
      com.rimaz.availability.AvailabilityResponse> getAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.rimaz.availability.AvailabilityRequest, com.rimaz.availability.AvailabilityResponse> getAvailabilityMethod;
    if ((getAvailabilityMethod = AvailabilityServiceGrpc.getAvailabilityMethod) == null) {
      synchronized (AvailabilityServiceGrpc.class) {
        if ((getAvailabilityMethod = AvailabilityServiceGrpc.getAvailabilityMethod) == null) {
          AvailabilityServiceGrpc.getAvailabilityMethod = getAvailabilityMethod = 
              io.grpc.MethodDescriptor.<com.rimaz.availability.AvailabilityRequest, com.rimaz.availability.AvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.AvailabilityService", "Availability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.availability.AvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rimaz.availability.AvailabilityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AvailabilityServiceMethodDescriptorSupplier("Availability"))
                  .build();
          }
        }
     }
     return getAvailabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AvailabilityServiceStub newStub(io.grpc.Channel channel) {
    return new AvailabilityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AvailabilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AvailabilityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AvailabilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AvailabilityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AvailabilityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void availability(com.rimaz.availability.AvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.availability.AvailabilityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAvailabilityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rimaz.availability.AvailabilityRequest,
                com.rimaz.availability.AvailabilityResponse>(
                  this, METHODID_AVAILABILITY)))
          .build();
    }
  }

  /**
   */
  public static final class AvailabilityServiceStub extends io.grpc.stub.AbstractStub<AvailabilityServiceStub> {
    private AvailabilityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AvailabilityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceStub(channel, callOptions);
    }

    /**
     */
    public void availability(com.rimaz.availability.AvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.rimaz.availability.AvailabilityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AvailabilityServiceBlockingStub extends io.grpc.stub.AbstractStub<AvailabilityServiceBlockingStub> {
    private AvailabilityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AvailabilityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rimaz.availability.AvailabilityResponse availability(com.rimaz.availability.AvailabilityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AvailabilityServiceFutureStub extends io.grpc.stub.AbstractStub<AvailabilityServiceFutureStub> {
    private AvailabilityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AvailabilityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AvailabilityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AvailabilityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rimaz.availability.AvailabilityResponse> availability(
        com.rimaz.availability.AvailabilityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AVAILABILITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AvailabilityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AvailabilityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVAILABILITY:
          serviceImpl.availability((com.rimaz.availability.AvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.rimaz.availability.AvailabilityResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AvailabilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rimaz.availability.Availability.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AvailabilityService");
    }
  }

  private static final class AvailabilityServiceFileDescriptorSupplier
      extends AvailabilityServiceBaseDescriptorSupplier {
    AvailabilityServiceFileDescriptorSupplier() {}
  }

  private static final class AvailabilityServiceMethodDescriptorSupplier
      extends AvailabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AvailabilityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AvailabilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AvailabilityServiceFileDescriptorSupplier())
              .addMethod(getAvailabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
