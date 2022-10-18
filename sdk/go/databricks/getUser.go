// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// # Adding user to administrative group
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			admins, err := databricks.LookupGroup(ctx, &GetGroupArgs{
//				DisplayName: "admins",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			me, err := databricks.LookupUser(ctx, &GetUserArgs{
//				UserName: pulumi.StringRef("me@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGroupMember(ctx, "myMemberA", &databricks.GroupMemberArgs{
//				GroupId:  pulumi.String(admins.Id),
//				MemberId: pulumi.String(me.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide
// * getCurrentUser data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * GroupMember to attach users and groups as group members.
// * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
// * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.
// * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	var rv LookupUserResult
	err := ctx.Invoke("databricks:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// ID of the user.
	UserId *string `pulumi:"userId"`
	// User name of the user. The user must exist before this resource can be planned.
	UserName *string `pulumi:"userName"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// Alphanumeric representation of user local name. e.g. `mrFoo`.
	Alphanumeric  string `pulumi:"alphanumeric"`
	ApplicationId string `pulumi:"applicationId"`
	// Display name of the user, e.g. `Mr Foo`.
	DisplayName string `pulumi:"displayName"`
	// ID of the user in an external identity provider.
	ExternalId string `pulumi:"externalId"`
	// Home folder of the user, e.g. `/Users/mr.foo@example.com`.
	Home string `pulumi:"home"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
	Repos  string  `pulumi:"repos"`
	UserId *string `pulumi:"userId"`
	// Name of the user, e.g. `mr.foo@example.com`.
	UserName *string `pulumi:"userName"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// ID of the user.
	UserId pulumi.StringPtrInput `pulumi:"userId"`
	// User name of the user. The user must exist before this resource can be planned.
	UserName pulumi.StringPtrInput `pulumi:"userName"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// Alphanumeric representation of user local name. e.g. `mrFoo`.
func (o LookupUserResultOutput) Alphanumeric() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Alphanumeric }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.ApplicationId }).(pulumi.StringOutput)
}

// Display name of the user, e.g. `Mr Foo`.
func (o LookupUserResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// ID of the user in an external identity provider.
func (o LookupUserResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

// Home folder of the user, e.g. `/Users/mr.foo@example.com`.
func (o LookupUserResultOutput) Home() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Home }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
func (o LookupUserResultOutput) Repos() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Repos }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.UserId }).(pulumi.StringPtrOutput)
}

// Name of the user, e.g. `mr.foo@example.com`.
func (o LookupUserResultOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.UserName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
