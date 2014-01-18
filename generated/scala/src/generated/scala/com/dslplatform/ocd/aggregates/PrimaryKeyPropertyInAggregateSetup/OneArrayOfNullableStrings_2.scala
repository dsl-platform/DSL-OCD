package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableStrings_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableStrings: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableStrings_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableStrings_2("+ URI +")"

   def copy(oneArrayOfNullableStrings: Array[Option[String]] = this._oneArrayOfNullableStrings): OneArrayOfNullableStrings_2 = {

  require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    new OneArrayOfNullableStrings_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableStrings = oneArrayOfNullableStrings)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableStrings_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableStrings = result._oneArrayOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableStrings_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableStrings = {
    _oneArrayOfNullableStrings
  }

  def oneArrayOfNullableStrings_= (value: Array[Option[String]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings") oneArrayOfNullableStrings: Array[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableStrings = if (oneArrayOfNullableStrings == null) Array.empty else oneArrayOfNullableStrings)

}

object OneArrayOfNullableStrings_2 extends AggregateRootCompanion[OneArrayOfNullableStrings_2]{

  def apply(
    oneArrayOfNullableStrings: Array[Option[String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
    new OneArrayOfNullableStrings_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableStrings = oneArrayOfNullableStrings)
  }

}
