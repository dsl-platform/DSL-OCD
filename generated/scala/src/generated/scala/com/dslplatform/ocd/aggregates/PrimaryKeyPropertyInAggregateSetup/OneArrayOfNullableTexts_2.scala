package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableTexts_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableTexts: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableTexts_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableTexts_2("+ URI +")"

   def copy(oneArrayOfNullableTexts: Array[Option[String]] = this._oneArrayOfNullableTexts): OneArrayOfNullableTexts_2 = {

  require(oneArrayOfNullableTexts ne null, "Null value was provided for property \"oneArrayOfNullableTexts\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTexts)
    new OneArrayOfNullableTexts_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableTexts = oneArrayOfNullableTexts)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableTexts_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableTexts = result._oneArrayOfNullableTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableTexts_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfNullableTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableTexts = {
    _oneArrayOfNullableTexts
  }

  def oneArrayOfNullableTexts_= (value: Array[Option[String]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTexts") oneArrayOfNullableTexts: Array[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableTexts = if (oneArrayOfNullableTexts == null) Array.empty else oneArrayOfNullableTexts)

}

object OneArrayOfNullableTexts_2 extends AggregateRootCompanion[OneArrayOfNullableTexts_2]{

  def apply(
    oneArrayOfNullableTexts: Array[Option[String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTexts)
    require(oneArrayOfNullableTexts ne null, "Null value was provided for property \"oneArrayOfNullableTexts\"")
    new OneArrayOfNullableTexts_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableTexts = oneArrayOfNullableTexts)
  }

}
