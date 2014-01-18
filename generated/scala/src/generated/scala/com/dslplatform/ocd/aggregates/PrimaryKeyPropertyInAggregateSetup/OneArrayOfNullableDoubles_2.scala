package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableDoubles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableDoubles: Array[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableDoubles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableDoubles_2("+ URI +")"

   def copy(oneArrayOfNullableDoubles: Array[Option[Double]] = this._oneArrayOfNullableDoubles): OneArrayOfNullableDoubles_2 = {

  require(oneArrayOfNullableDoubles ne null, "Null value was provided for property \"oneArrayOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableDoubles)
    new OneArrayOfNullableDoubles_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableDoubles = oneArrayOfNullableDoubles)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableDoubles_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableDoubles = result._oneArrayOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableDoubles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableDoubles = {
    _oneArrayOfNullableDoubles
  }

  def oneArrayOfNullableDoubles_= (value: Array[Option[Double]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDoubles") oneArrayOfNullableDoubles: Array[Option[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableDoubles = if (oneArrayOfNullableDoubles == null) Array.empty else oneArrayOfNullableDoubles)

}

object OneArrayOfNullableDoubles_2 extends AggregateRootCompanion[OneArrayOfNullableDoubles_2]{

  def apply(
    oneArrayOfNullableDoubles: Array[Option[Double]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableDoubles)
    require(oneArrayOfNullableDoubles ne null, "Null value was provided for property \"oneArrayOfNullableDoubles\"")
    new OneArrayOfNullableDoubles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableDoubles = oneArrayOfNullableDoubles)
  }

}
