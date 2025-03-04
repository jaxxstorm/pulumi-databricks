// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// > **Note** If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Provisioning Databricks on AWS guide.
// * MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
// * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
// * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
// * MwsStorageConfigurations to configure root bucket new workspaces within AWS.
// * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MwsCustomerManagedKeys struct {
	pulumi.CustomResourceState

	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// This field is a block and is documented below.
	AwsKeyInfo MwsCustomerManagedKeysAwsKeyInfoOutput `pulumi:"awsKeyInfo"`
	// (Integer) Time in epoch milliseconds when the customer key was created.
	CreationTime pulumi.IntOutput `pulumi:"creationTime"`
	// (String) ID of the encryption key configuration object.
	CustomerManagedKeyId pulumi.StringOutput `pulumi:"customerManagedKeyId"`
	// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
	UseCases pulumi.StringArrayOutput `pulumi:"useCases"`
}

// NewMwsCustomerManagedKeys registers a new resource with the given unique name, arguments, and options.
func NewMwsCustomerManagedKeys(ctx *pulumi.Context,
	name string, args *MwsCustomerManagedKeysArgs, opts ...pulumi.ResourceOption) (*MwsCustomerManagedKeys, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AwsKeyInfo == nil {
		return nil, errors.New("invalid value for required argument 'AwsKeyInfo'")
	}
	if args.UseCases == nil {
		return nil, errors.New("invalid value for required argument 'UseCases'")
	}
	var resource MwsCustomerManagedKeys
	err := ctx.RegisterResource("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsCustomerManagedKeys gets an existing MwsCustomerManagedKeys resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsCustomerManagedKeys(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsCustomerManagedKeysState, opts ...pulumi.ResourceOption) (*MwsCustomerManagedKeys, error) {
	var resource MwsCustomerManagedKeys
	err := ctx.ReadResource("databricks:index/mwsCustomerManagedKeys:MwsCustomerManagedKeys", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsCustomerManagedKeys resources.
type mwsCustomerManagedKeysState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId *string `pulumi:"accountId"`
	// This field is a block and is documented below.
	AwsKeyInfo *MwsCustomerManagedKeysAwsKeyInfo `pulumi:"awsKeyInfo"`
	// (Integer) Time in epoch milliseconds when the customer key was created.
	CreationTime *int `pulumi:"creationTime"`
	// (String) ID of the encryption key configuration object.
	CustomerManagedKeyId *string `pulumi:"customerManagedKeyId"`
	// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
	UseCases []string `pulumi:"useCases"`
}

type MwsCustomerManagedKeysState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringPtrInput
	// This field is a block and is documented below.
	AwsKeyInfo MwsCustomerManagedKeysAwsKeyInfoPtrInput
	// (Integer) Time in epoch milliseconds when the customer key was created.
	CreationTime pulumi.IntPtrInput
	// (String) ID of the encryption key configuration object.
	CustomerManagedKeyId pulumi.StringPtrInput
	// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
	UseCases pulumi.StringArrayInput
}

func (MwsCustomerManagedKeysState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsCustomerManagedKeysState)(nil)).Elem()
}

type mwsCustomerManagedKeysArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId string `pulumi:"accountId"`
	// This field is a block and is documented below.
	AwsKeyInfo MwsCustomerManagedKeysAwsKeyInfo `pulumi:"awsKeyInfo"`
	// (Integer) Time in epoch milliseconds when the customer key was created.
	CreationTime *int `pulumi:"creationTime"`
	// (String) ID of the encryption key configuration object.
	CustomerManagedKeyId *string `pulumi:"customerManagedKeyId"`
	// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
	UseCases []string `pulumi:"useCases"`
}

// The set of arguments for constructing a MwsCustomerManagedKeys resource.
type MwsCustomerManagedKeysArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringInput
	// This field is a block and is documented below.
	AwsKeyInfo MwsCustomerManagedKeysAwsKeyInfoInput
	// (Integer) Time in epoch milliseconds when the customer key was created.
	CreationTime pulumi.IntPtrInput
	// (String) ID of the encryption key configuration object.
	CustomerManagedKeyId pulumi.StringPtrInput
	// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
	UseCases pulumi.StringArrayInput
}

func (MwsCustomerManagedKeysArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsCustomerManagedKeysArgs)(nil)).Elem()
}

type MwsCustomerManagedKeysInput interface {
	pulumi.Input

	ToMwsCustomerManagedKeysOutput() MwsCustomerManagedKeysOutput
	ToMwsCustomerManagedKeysOutputWithContext(ctx context.Context) MwsCustomerManagedKeysOutput
}

func (*MwsCustomerManagedKeys) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsCustomerManagedKeys)(nil)).Elem()
}

func (i *MwsCustomerManagedKeys) ToMwsCustomerManagedKeysOutput() MwsCustomerManagedKeysOutput {
	return i.ToMwsCustomerManagedKeysOutputWithContext(context.Background())
}

func (i *MwsCustomerManagedKeys) ToMwsCustomerManagedKeysOutputWithContext(ctx context.Context) MwsCustomerManagedKeysOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsCustomerManagedKeysOutput)
}

// MwsCustomerManagedKeysArrayInput is an input type that accepts MwsCustomerManagedKeysArray and MwsCustomerManagedKeysArrayOutput values.
// You can construct a concrete instance of `MwsCustomerManagedKeysArrayInput` via:
//
//	MwsCustomerManagedKeysArray{ MwsCustomerManagedKeysArgs{...} }
type MwsCustomerManagedKeysArrayInput interface {
	pulumi.Input

	ToMwsCustomerManagedKeysArrayOutput() MwsCustomerManagedKeysArrayOutput
	ToMwsCustomerManagedKeysArrayOutputWithContext(context.Context) MwsCustomerManagedKeysArrayOutput
}

type MwsCustomerManagedKeysArray []MwsCustomerManagedKeysInput

func (MwsCustomerManagedKeysArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsCustomerManagedKeys)(nil)).Elem()
}

func (i MwsCustomerManagedKeysArray) ToMwsCustomerManagedKeysArrayOutput() MwsCustomerManagedKeysArrayOutput {
	return i.ToMwsCustomerManagedKeysArrayOutputWithContext(context.Background())
}

func (i MwsCustomerManagedKeysArray) ToMwsCustomerManagedKeysArrayOutputWithContext(ctx context.Context) MwsCustomerManagedKeysArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsCustomerManagedKeysArrayOutput)
}

// MwsCustomerManagedKeysMapInput is an input type that accepts MwsCustomerManagedKeysMap and MwsCustomerManagedKeysMapOutput values.
// You can construct a concrete instance of `MwsCustomerManagedKeysMapInput` via:
//
//	MwsCustomerManagedKeysMap{ "key": MwsCustomerManagedKeysArgs{...} }
type MwsCustomerManagedKeysMapInput interface {
	pulumi.Input

	ToMwsCustomerManagedKeysMapOutput() MwsCustomerManagedKeysMapOutput
	ToMwsCustomerManagedKeysMapOutputWithContext(context.Context) MwsCustomerManagedKeysMapOutput
}

type MwsCustomerManagedKeysMap map[string]MwsCustomerManagedKeysInput

func (MwsCustomerManagedKeysMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsCustomerManagedKeys)(nil)).Elem()
}

func (i MwsCustomerManagedKeysMap) ToMwsCustomerManagedKeysMapOutput() MwsCustomerManagedKeysMapOutput {
	return i.ToMwsCustomerManagedKeysMapOutputWithContext(context.Background())
}

func (i MwsCustomerManagedKeysMap) ToMwsCustomerManagedKeysMapOutputWithContext(ctx context.Context) MwsCustomerManagedKeysMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsCustomerManagedKeysMapOutput)
}

type MwsCustomerManagedKeysOutput struct{ *pulumi.OutputState }

func (MwsCustomerManagedKeysOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsCustomerManagedKeys)(nil)).Elem()
}

func (o MwsCustomerManagedKeysOutput) ToMwsCustomerManagedKeysOutput() MwsCustomerManagedKeysOutput {
	return o
}

func (o MwsCustomerManagedKeysOutput) ToMwsCustomerManagedKeysOutputWithContext(ctx context.Context) MwsCustomerManagedKeysOutput {
	return o
}

// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
func (o MwsCustomerManagedKeysOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsCustomerManagedKeys) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// This field is a block and is documented below.
func (o MwsCustomerManagedKeysOutput) AwsKeyInfo() MwsCustomerManagedKeysAwsKeyInfoOutput {
	return o.ApplyT(func(v *MwsCustomerManagedKeys) MwsCustomerManagedKeysAwsKeyInfoOutput { return v.AwsKeyInfo }).(MwsCustomerManagedKeysAwsKeyInfoOutput)
}

// (Integer) Time in epoch milliseconds when the customer key was created.
func (o MwsCustomerManagedKeysOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsCustomerManagedKeys) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

// (String) ID of the encryption key configuration object.
func (o MwsCustomerManagedKeysOutput) CustomerManagedKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsCustomerManagedKeys) pulumi.StringOutput { return v.CustomerManagedKeyId }).(pulumi.StringOutput)
}

// *(since v0.3.4)* List of use cases for which this key will be used. *If you've used the resource before, please add `useCases = ["MANAGED_SERVICES"]` to keep the previous behaviour.* Possible values are:
func (o MwsCustomerManagedKeysOutput) UseCases() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MwsCustomerManagedKeys) pulumi.StringArrayOutput { return v.UseCases }).(pulumi.StringArrayOutput)
}

type MwsCustomerManagedKeysArrayOutput struct{ *pulumi.OutputState }

func (MwsCustomerManagedKeysArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsCustomerManagedKeys)(nil)).Elem()
}

func (o MwsCustomerManagedKeysArrayOutput) ToMwsCustomerManagedKeysArrayOutput() MwsCustomerManagedKeysArrayOutput {
	return o
}

func (o MwsCustomerManagedKeysArrayOutput) ToMwsCustomerManagedKeysArrayOutputWithContext(ctx context.Context) MwsCustomerManagedKeysArrayOutput {
	return o
}

func (o MwsCustomerManagedKeysArrayOutput) Index(i pulumi.IntInput) MwsCustomerManagedKeysOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsCustomerManagedKeys {
		return vs[0].([]*MwsCustomerManagedKeys)[vs[1].(int)]
	}).(MwsCustomerManagedKeysOutput)
}

type MwsCustomerManagedKeysMapOutput struct{ *pulumi.OutputState }

func (MwsCustomerManagedKeysMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsCustomerManagedKeys)(nil)).Elem()
}

func (o MwsCustomerManagedKeysMapOutput) ToMwsCustomerManagedKeysMapOutput() MwsCustomerManagedKeysMapOutput {
	return o
}

func (o MwsCustomerManagedKeysMapOutput) ToMwsCustomerManagedKeysMapOutputWithContext(ctx context.Context) MwsCustomerManagedKeysMapOutput {
	return o
}

func (o MwsCustomerManagedKeysMapOutput) MapIndex(k pulumi.StringInput) MwsCustomerManagedKeysOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsCustomerManagedKeys {
		return vs[0].(map[string]*MwsCustomerManagedKeys)[vs[1].(string)]
	}).(MwsCustomerManagedKeysOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsCustomerManagedKeysInput)(nil)).Elem(), &MwsCustomerManagedKeys{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsCustomerManagedKeysArrayInput)(nil)).Elem(), MwsCustomerManagedKeysArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsCustomerManagedKeysMapInput)(nil)).Elem(), MwsCustomerManagedKeysMap{})
	pulumi.RegisterOutputType(MwsCustomerManagedKeysOutput{})
	pulumi.RegisterOutputType(MwsCustomerManagedKeysArrayOutput{})
	pulumi.RegisterOutputType(MwsCustomerManagedKeysMapOutput{})
}
