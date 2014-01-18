package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneUrls: Array[java.net.URI]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneUrls_3("+ URI +")"

   def copy(oneArrayOfOneUrls: Array[java.net.URI] = this._oneArrayOfOneUrls): OneArrayOfOneUrls_3 = {

  require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)
    new OneArrayOfOneUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneUrls = oneArrayOfOneUrls)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneUrls_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneUrls = result._oneArrayOfOneUrls
    this._ID = result._ID
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfOneUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneUrls = {
    _oneArrayOfOneUrls
  }

  def oneArrayOfOneUrls_= (value: Array[java.net.URI]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls") oneArrayOfOneUrls: Array[java.net.URI]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneUrls = if (oneArrayOfOneUrls == null) Array.empty else oneArrayOfOneUrls)

}

object OneArrayOfOneUrls_3 extends AggregateRootCompanion[OneArrayOfOneUrls_3]{

  def apply(
    oneArrayOfOneUrls: Array[java.net.URI] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)
    require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
    new OneArrayOfOneUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneUrls = oneArrayOfOneUrls)
  }

}
