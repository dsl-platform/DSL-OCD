package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableIntegers_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableIntegers: Array[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableIntegers_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableIntegers_2("+ URI +")"

   def copy(oneArrayOfNullableIntegers: Array[Option[Int]] = this._oneArrayOfNullableIntegers): OneArrayOfNullableIntegers_2 = {

  require(oneArrayOfNullableIntegers ne null, "Null value was provided for property \"oneArrayOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableIntegers)
    new OneArrayOfNullableIntegers_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableIntegers = oneArrayOfNullableIntegers)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableIntegers_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableIntegers = result._oneArrayOfNullableIntegers
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableIntegers_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableIntegers = {
    _oneArrayOfNullableIntegers
  }

  def oneArrayOfNullableIntegers_= (value: Array[Option[Int]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIntegers") oneArrayOfNullableIntegers: Array[Option[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableIntegers = if (oneArrayOfNullableIntegers == null) Array.empty else oneArrayOfNullableIntegers)

}

object OneArrayOfNullableIntegers_2 extends AggregateRootCompanion[OneArrayOfNullableIntegers_2]{

  def apply(
    oneArrayOfNullableIntegers: Array[Option[Int]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableIntegers)
    require(oneArrayOfNullableIntegers ne null, "Null value was provided for property \"oneArrayOfNullableIntegers\"")
    new OneArrayOfNullableIntegers_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableIntegers = oneArrayOfNullableIntegers)
  }

}